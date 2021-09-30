package com.xiong.commons.config;

import java.text.*;
import java.util.Date;

/**
 * @program: emr
 * @description:
 * @author: yzxia
 * @create: 2019-12-05 10:57
 **/
public class ObjectMapperDateFormatExtend extends DateFormat {

    private static final long serialVersionUID = 1L;
    private DateFormat dateFormat ;

    private SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**构造函数传入objectmapper默认的dateformat*/
    public ObjectMapperDateFormatExtend(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * 序列化时会执行这个方法
     */
    @Override
    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        return new StringBuffer(format1.format(date));
        //return dateFormat.format(date, toAppendTo, fieldPosition);
    }

    /**
     * 反序列化时执行此方法，我们先让他执行我们自己的format，如果异常则执执行他的
     * 当然这里只是简单实现，可以有更优雅的方式来处理更多的格式
     */
    @Override
    public Date parse(String source, ParsePosition pos) {
        Date date;
        try {
            date = DateConverter.formatDate(source);
        } catch (Exception e) {
            date = dateFormat.parse(source, pos);
        }
        return date;
    }


    /**
     * 反序列化时执行此方法，我们先让他执行我们自己的format，如果异常则执执行他的
     * 当然这里只是简单实现，可以有更优雅的方式来处理更多的格式
     */
    @Override
    public Date parse(String source) throws ParseException {
        Date date;
        try {
            date = DateConverter.formatDate(source);
        } catch (Exception e) {
            date = dateFormat.parse(source);
        }
        return date;
    }
    /**
     * 此方法在objectmapper 默认的dateformat里边用到，这里也要重写
     */
    @Override
    public Object clone() {
        DateFormat dateFormat = (DateFormat) this.dateFormat.clone();
        return new ObjectMapperDateFormatExtend(dateFormat);
    }

}
