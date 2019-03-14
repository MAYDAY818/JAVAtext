package one;

import one.msy.Person;

public class Teacher extends Person{
	public Teacher() {
		super("",9);
		System.out.println("调用了子类Teacher的构造方法");
	}
	public Teacher(String name) {
		super(name);
		System.out.println("调用了子类Teacher的有参数的构造方法");
	}
	//重写父类Person中的display方法
	public void display() {
		System.out.println("Teacher dispaly 显示信息");
		super.setName("");
		super.display();
	}
	public void displayEx() {
		System.out.println("displayEx 显示信息");
	}
	//实现接口AnimalInterface中的方法
	@Override
	public void shout() {
		// TODO Auto-generated method stub
		
	}

}
