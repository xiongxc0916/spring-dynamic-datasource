package com.xiong.server.controller;

import com.xiong.commons.utils.R;
import com.xiong.service.dict.service.DictDiseaseService;
import com.xiong.service.his.service.HisHospitalService;
import com.xiong.service.log.service.LogApiActionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: 疾病字典
 * @author: xxc
 * @Date: 1.0.0 2021-09-30
 */
@RestController
@RequestMapping("/dynamic/demo/")
@Api(tags = "测试接口")
public class DictDiseaseController {
    @Resource
    private DictDiseaseService dictDiseaseService;
    @Resource
    private LogApiActionService logApiActionService;
    @Resource
    private HisHospitalService hisHospitalService;


    @GetMapping(value = "/listAll")
    @ApiOperation("查询所有数据")
    public R updateTemplate(@RequestParam(value = "userName",required = false) String userName) {
        R r = R.ok();
        r.put("dict", dictDiseaseService.list());
        r.put("his", hisHospitalService.list());
        r.put("log", logApiActionService.list());
        return r;
    }
}