package com.ybj.news_website;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;
import com.ybj.news_website.util.MailUtil;
import javax.validation.constraints.Email;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsWebsiteApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private JavaMailSender mailSender;

    @Test
    public void sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1793870688@qq.com");
        message.setTo("312ybj@gmail.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");

        mailSender.send(message);
    }


}
