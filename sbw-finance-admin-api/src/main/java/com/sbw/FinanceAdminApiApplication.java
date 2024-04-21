package com.sbw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * @Description 启动类
 * @ProjectName Default (Template) Project
 * @ClassName ${NAME}
 * @Date 2024/4/19 20:00
 * @Created By 孙博文
 * @Version 1.0.0
 */
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class FinanceAdminApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceAdminApiApplication.class, args);
    }
}