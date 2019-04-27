package com.ybj.news_website.util;

public class Tests {
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
