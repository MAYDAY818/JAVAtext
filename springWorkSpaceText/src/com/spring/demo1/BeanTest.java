package com.spring.demo1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

class BeanTest {

	@Test
	void test() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Bean bean = (Bean) bf.getBean("bean");
		assertEquals("lalllalaa",bean.getText());
	}

}
