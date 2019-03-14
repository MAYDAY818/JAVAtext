package com.spring.demo01;
/**
 * 创建工厂类
 * @author Administrator
 *
 */
public class MyTestBeanFactory {
	
	  //创建静态方法  
    public static MyTestBean createMyTestBean(){  
         //返回实例化的类的对象  
        return new MyTestBean();  
    }  
}
//根据这个中实例化方法的名称就可以知道要想通过这种方式进行实例化就要具备两个条件：
//（一）、要有工厂类及其工厂方法；
//（二）、工厂方法是静态的。
