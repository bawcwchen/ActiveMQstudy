package com.chenjun.configuration;

import com.chenjun.model.ClassMate;
import org.springframework.context.annotation.Bean;

/**
 * Function Desc: 该类不用加@Configuration，是为了给其他@Configuration的类import
 * Date:2018/5/8 21:41
 * author:jun.chen02@hand-china.com
 */
public class ClassMateConfiguration {

    @Bean
    public ClassMate classMate(){
        ClassMate classMate = new ClassMate();
        classMate.setName("1班");
        return classMate;
    }
}
