package demo04;

public class Person {
	static String name;
	static{
		name="XXXX";
		System.out.println("Person 类的静态代码块初始化name属性");
		
	}
	
	public   String getName() {
//		this.name="";
		return name;
	}
	public static void display(int i,String ...s) {
		System.out.println("person类中的静态方法display");
//		getName();
	
	}
	

}
