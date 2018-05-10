package com.chenjun.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Function Desc: TODO
 * Date:2018/5/9 21:36
 * author:jun.chen02@hand-china.com
 */
@Component //定义一个组件
@Aspect  //将该组件定义为切面
public class AppleAspect {

    @AfterReturning("execution(* com.chenjun..*Service.*(..))")
    public void print(JoinPoint joinpoint) {
        System.out.println("hello:");
    }
}
