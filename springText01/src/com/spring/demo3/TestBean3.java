package com.spring.demo3;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demo2.TestBean2;

public class TestBean3 {
	  @Test
	    public void test(){
		  //调用applicationContext的java配置实现形式 将我们配置的java文件加入到我们的类中，让spring容器帮我们把类管理起来
	        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfig.class);
	        //直接获取接口类对象
	        BeanFactory beanFactorys=applicationContext.getBean(BeanFactory.class);
	        beanFactorys.Beantest();  //This is a 基于类的Java Config Bean！
	    }
	  public static void main(String[] args) {
		   TestBean3 tb=new TestBean3();
		   tb.test();
	}
}
