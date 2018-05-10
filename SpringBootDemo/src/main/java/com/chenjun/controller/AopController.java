package com.chenjun.controller;

import com.chenjun.service.AppleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function Desc: aop演示
 * Date:2018/5/9 21:32
 * author:jun.chen02@hand-china.com
 */
@RestController
public class AopController {

    @Autowired
    private AppleService appleService;

    @RequestMapping("/aop")
    public String printMessage() {
        System.out.println(appleService.printMessage("cj"));
        return "ok";
    }
}
