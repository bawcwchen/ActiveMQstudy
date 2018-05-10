package com.chenjun.controller;

import com.chenjun.configuration.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Function Desc: 列表注入
 * Date:2018/5/10 21:12
 * author:jun.chen02@hand-china.com
 */
@RestController
public class ConfigurationPropertiesController {

    @Autowired
    private DataSourceConfig dataSourceConfig;

    @RequestMapping("/configuration")
    public List<String> print(){
        return dataSourceConfig.getFruit();
    }

}
