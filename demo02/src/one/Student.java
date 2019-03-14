package one;

import one.msy.Person;

public class Student extends Person implements Comparable<Student>{
   private int age;
   
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 实现接口AnimalInterface中的方法
	 */
	@Override
	public void shout() {
	
	}
   public Object copyStudent() {
	   Object clone=null;
		try {
			clone = clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	 return clone;
   }
   /**
    * 实现Comparable接口中的方法
    * */
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(this.age>s.age) {
			return this.age-s.age;
		}else if(this.age<s.age) {
			return this.age-s.age;
		}else {
			return 0;
		}
	}
	

}
