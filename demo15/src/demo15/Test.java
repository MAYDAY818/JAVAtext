package demo15;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.study("Êý¾Ý¿â");
//		Class<? extends Student> c1 = s1.getClass();
		Class<?> c1=null;
		try {
			c1 = Class.forName("demo15.Student");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Field[] fields = c1.getFields();
		for(Field field:fields) {
//			System.out.println(field.getType()+" "+field.getName());
		}
		Method[] methods = c1.getMethods();
		for(int i=0;i<methods.length;i++) {
			Method method = methods[i];
//			System.out.println(method.getName()+" "+method.getReturnType());
			if(method.getName().equals("study")) {
				try {
					method.invoke(s1, "C++");
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
	}

}
