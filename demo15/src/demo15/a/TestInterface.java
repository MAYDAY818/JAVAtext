package demo15.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestInterface {
	public static void testMethod(String classname) {
		try {
			Class<?> c1 = Class.forName(classname);
			Object o = c1.newInstance();
			Method[] methods = c1.getMethods();
			for(int i=0;i<methods.length;i++) {
				Method method = methods[i];
				if(method.getName().equals("s1")) {
				method.invoke(o);
				}
				if(method.getName().equals("s2")) {
					method.invoke(o, "C");
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
