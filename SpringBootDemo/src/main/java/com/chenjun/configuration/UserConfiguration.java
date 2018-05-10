package com.chenjun.configuration;

import com.chenjun.model.Address;
import com.chenjun.model.ClassMate;
import com.chenjun.model.Grade;
import com.chenjun.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Function Desc: TODO
 * Date:2018/5/8 21:28
 * author:jun.chen02@hand-china.com
 */
@Configuration
@Import({ClassMateConfiguration.class})//导入类中的bean
@ImportResource(locations = {"classpath:beans.xml"})//导入xml中的bean
public class UserConfiguration {
   /* @Autowired
    private ClassMate classMate;*/ //属性依赖

    @Bean
    public User user(Grade grade,ClassMate classMate,Address address) {//通过参数依赖注入
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        user.setGrade(grade);
//        user.setGrade(grade());//也行
        user.setClassMate(classMate);
        user.setAddress(address);
        return user;
    }

    @Bean
    public Grade grade() {
        Grade grade = new Grade();
        grade.setGoal(100);
        return grade;
    }

}
