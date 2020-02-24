package com.colon.spiderutil;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.colon.spiderutil.mapper"})
public class SpiderutilApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiderutilApplication.class, args);
    }

}
