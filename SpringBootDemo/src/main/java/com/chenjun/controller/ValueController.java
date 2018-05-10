package com.chenjun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function Desc: TODO
 * Date:2018/5/10 21:24
 * author:jun.chen02@hand-china.com
 */
@RestController
public class ValueController {

    @Value("${goodmorning}")
    private String hello;

    @RequestMapping(value = "/value")
    public String print() {
        return hello;
    }
}
