package com.ybj.news_website.util;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class Tests {

	@Autowired
	MailUtil mailUtil;

	@Test
	public void sendSimpleEmail() {
		String deliver = "1793870688@qq.com";
		String[] receiver = {"312ybj@gmail.com"};
		String[] carbonCopy = {"抄送者邮件地址"};
		String subject = "This is a simple email";
		String content = "This is a simple content";

		try {
			mailUtil.sendSimpleEmail(deliver, receiver, carbonCopy, subject, content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 *


	@Test
	public void test()
	{
		String resource="mybatis.xml";
		
		InputStream  is = Tests.class.getClassLoader().getResourceAsStream(resource);
		
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
	
		SqlSession session=sessionFactory.openSession();
		
		String statement="com.ybj.website.mapper.UserMapping.getUser";

		User user=session.selectOne(statement, "9");
		
		System.out.println(user.toString());
	}
	 */

}
