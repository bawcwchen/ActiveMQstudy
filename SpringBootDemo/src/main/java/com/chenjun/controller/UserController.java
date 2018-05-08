package com.chenjun.controller;

import com.chenjun.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function Desc: TODO
 * Date:2018/5/8 21:49
 * author:jun.chen02@hand-china.com
 */
@RestController
public class UserController {
    @Autowired
    private User user;

    @RequestMapping("/user")
    public String home() {
        return user.getName() + ":" + user.getGrade().getGoal()
                + ":" + user.getClassMate().getName()
                + ":" + user.getAddress().getLocation();
    }
}
