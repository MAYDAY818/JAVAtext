package com.spring.demo01;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo01.MyTestBean;

class MyTestBeanTest {

	@Test
	void test() {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		MyTestBean bean = (MyTestBean) ctx.getBean("myTestBean2");
		//使用断言来判断 运行是否正确
		assertEquals("testStr", bean.getTestStr());
	}

}
