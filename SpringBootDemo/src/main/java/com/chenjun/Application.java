package com.chenjun;

import com.chenjun.configuration.DataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Function Desc: scanBasePackages可以不用显示加上，因为当前启动类就是在com.chenjun包下，所以默认扫描的包也是当前包
 * Date:2018/5/7 22:25
 * author:jun.chen02@hand-china.com
 */
@SpringBootApplication(scanBasePackages = {"com.chenjun"})
@EnableConfigurationProperties(DataSourceConfig.class)
//这是一个组合注解，开启注解配置及扫描组件
//same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 容器中所有的bean
     * @param ctx
     * @return
     */
    /*@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }*/
}
