package com.xiong.commons.utils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: xxc
 * @Date: 2021-08-19 10:31
 * @Description:
 */
public class SQLUtil {

    public static String insertSQL(Map<String, Object> insertMap, String tableName) {
        Map<String, String> map = new LinkedHashMap<>();
        insertMap.forEach((k, v) -> {
            map.put(k, FigureUtil.valueOfString(v, null));
        });
        String feilds = map.keySet().stream().collect(Collectors.joining("`,`"));
        String values = map.values().stream().collect(Collectors.joining("','"));
        StringBuffer sql = new StringBuffer();
        sql.append("insert into " + tableName + "(");
        sql.append("`" + feilds + "`");
        sql.append(")");
        sql.append(" VALUES ('");
        sql.append(values);
        sql.append("')");
        return sql.toString().replace("'null'", "null");
    }

    public static String insertSQLs(LinkedHashSet<String> insertKeys, List<LinkedHashMap<String, String>> insertMaps, String tableName) {
        StringBuffer sql = new StringBuffer();
        String feilds = insertKeys.stream().collect(Collectors.joining("`,`"));
        sql.append("insert into " + tableName + "(");
        sql.append("`" + feilds + "`");
        sql.append(")");
        sql.append(" VALUES ");
        for (Iterator i = insertMaps.iterator(); i.hasNext(); ) {
            LinkedHashMap<String, String> data = (LinkedHashMap<String, String>) i.next();
            String values = data.values().stream().collect(Collectors.joining("','"));
            sql.append("('");
            sql.append(values);
            sql.append("')");
            if (i.hasNext()) {
                sql.append(",");
            }
        }
        return sql.toString().replace("'null'", "null");
    }

    public static String deleteSQL(Map<String, Object> insertMap, String tableName) {
        StringBuffer sql = new StringBuffer();
        sql.append("delete from " + tableName + " where ");
        for (Iterator<Map.Entry<String, Object>> iterator = insertMap.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, Object> map = iterator.next();
            String value = map.getValue() == null ? null : FigureUtil.valueOfString(map.getValue());
            sql.append("`").append(map.getKey()).append("`").append("='").append(value).append("'");
            if (iterator.hasNext()) {
                sql.append(" and ");
            }
        }
        return sql.toString().replace("'null'", "null");
    }

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "6536");
        map.put("drug_code", "X-A10BA-E021-A017");
        System.out.println(deleteSQL(map, "log_drug_influence_exam"));
    }
}
