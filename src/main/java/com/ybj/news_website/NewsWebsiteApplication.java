package com.ybj.news_website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.ybj.news_website.mapper")
@SpringBootApplication()
public class NewsWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsWebsiteApplication.class, args);
    }

}
