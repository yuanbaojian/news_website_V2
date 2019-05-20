package com.ybj.news_website;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@MapperScan("com.ybj.news_website.mapper")
@SpringBootApplication()
@EnableCaching//开启缓存
public class NewsWebsiteApplication {

    public static void main(String[] args) {

        SpringApplication.run(NewsWebsiteApplication.class, args);
    }


}
