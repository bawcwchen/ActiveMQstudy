package com.chenjun.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Function Desc: 列表注入
 * Date:2018/5/10 21:07
 * author:jun.chen02@hand-china.com
 */
@Component
@ConfigurationProperties(prefix = "favoite")
public class DataSourceConfig {

    private List<String> fruit = new ArrayList<>();

    public List<String> getFruit() {
        return fruit;
    }
}
