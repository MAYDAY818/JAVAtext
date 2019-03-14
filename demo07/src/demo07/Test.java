package demo07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer i= new Integer(100);
//		Integer ii= new Integer(100);
//		System.out.println(i==ii);
//		
//		Integer i1= 100;
//		Integer i2=100;
//		System.out.println(i1==i2);
//		
//		Integer i3=200;
//		Integer i4=200;
//		System.out.println(i3==i4);
		
//		File file = new File("d://a.txt");
//		try {
//				
//			FileInputStream fis = new FileInputStream(file);
//			
//			Class.forName("demo07.Test");
//			System.out.println("try剩余的代码");
//		}catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			System.out.println("找不到文件");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			System.out.println("类找不到");
//		}catch(Exception e) {
//			
//		} finally {
//			
//		}
//		
//		System.out.println("ffff");
		
//		Student student = new Student();
//		String result=null;
//		try {
//			result = student.display("");
//		} catch (ClassNotFoundException | FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(result);
		
		Person person = new Person();
		Object o = null;
		person.doWork(o,"abc");
			try {
				Class.forName("cmmm");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			Person p = new Teacher();
			Classes cla = new Classes();
			cla.methods(p);
	}
	
	

}
