package one;

import one.msy.Person;
import one.msy.interfacedemo.Animal;
import one.msy.interfacedemo.AnimalInterface;
import one.msy.interfacedemo.Dog;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p1 = new  Person();
//		Teacher t1 = new Teacher("ÕÅÈý");
//		p1.display();
//		
//		t1.displayEx();
//		t1.display();
		
//		Animal a= new Dog();
//		Person p = new Student();
//		AnimalInterface ai= new Student();
		
//		Object o = new Student();
//		
//		Object o2 = new Dog();
//		Object o3 = new String();
//		int i=5;
//		Object o4  = 5;
		Student ss = new Student();
		Object copyStudent = ss.copyStudent();		
		System.out.println(copyStudent);
	}

}
