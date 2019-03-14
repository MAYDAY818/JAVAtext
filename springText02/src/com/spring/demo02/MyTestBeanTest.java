package com.spring.demo02;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTestBeanTest {

	@Test
	public void test() {
		
		 ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		 MyTestBean bean= (MyTestBean) ctx.getBean("myTestBean3");
			//使用断言来判断 运行是否正确
			assertEquals("testStr", bean.getTestStr());
	}

}
