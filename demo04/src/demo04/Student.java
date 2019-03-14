package demo04;

public class Student extends Person {
 static {
	 System.out.println("Student 类中的静态代码块被执行");
 }
 
 public static void studentStatic() {
	 System.out.println("student 的静态方法studentStatic执行");
 }
 
}
