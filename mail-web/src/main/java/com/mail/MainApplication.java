package com.mail;

import com.common.annotation.EnableGlobalExceptionHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by tao.zeng on 2018/9/21.
 */
@SpringBootApplication
@MapperScan("com.mail.mapper")
@EnableGlobalExceptionHandler
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
