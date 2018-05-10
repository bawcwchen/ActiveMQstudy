package com.chenjun.service.impl;

import com.chenjun.service.AppleService;
import org.springframework.stereotype.Component;

/**
 * Function Desc: TODO
 * Date:2018/5/9 21:39
 * author:jun.chen02@hand-china.com
 */
@Component
public class AppleServiceImpl implements AppleService {

    @Override
    public String printMessage(String msg) {
        return msg;
    }
}
