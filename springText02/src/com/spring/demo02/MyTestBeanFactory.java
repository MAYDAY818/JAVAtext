package com.spring.demo02;

/**
 * 创建工厂类
 * @author Administrator
 *
 */
public class MyTestBeanFactory {

	  //无需再创建静态方法  
  public MyTestBean createMyTestBean(){  
       //返回实例化的类的对象  
      return new MyTestBean();  
}
}