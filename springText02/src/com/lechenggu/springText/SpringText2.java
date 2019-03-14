package com.lechenggu.springText;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.lechenggu.springDemo1.User;

public class SpringText2 {
public static void main(String[] args) {
	BeanFactory act = new XmlBeanFactory( new ClassPathResource("bean.xml"));
	
	User user=(User) act.getBean("user");
	
	System.out.println(user.getName()+user.getPwd());
	
	BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
	
	//加载多个文件
	String[] locations = {"bean1.xml", "bean2.xml", "bean3.xml"};  
	ApplicationContext ctx1 =new ClassPathXmlApplicationContext(locations);  
	 
}
}
