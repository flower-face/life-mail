package com.zz.mail;

import com.zz.cloud.core.annotation.EnableGlobalExceptionHandler;
import com.zz.cloud.core.annotation.EnableHttpLoggerAspect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by tao.zeng on 2018/9/21.
 */
@EnableHttpLoggerAspect
@EnableGlobalExceptionHandler
@MapperScan("com.zz.mail.mapper")
@SpringBootApplication(scanBasePackages = {"com.zz.mail", "com.zz.cloud.core"})
public class MailServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailServiceApplication.class, args);
    }
}
