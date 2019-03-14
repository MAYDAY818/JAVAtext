package demo07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Student extends Person {
	
	public String display(String classname) throws FileNotFoundException, ClassNotFoundException   {
		
		File file = new File("d://a.txt");
		FileInputStream fis = new FileInputStream(file);
		try {
			Class.forName(classname);
			System.exit(0);
			return  "程序正常执行";
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("类没有找到");
			throw e;
			
		}finally {
			System.out.println("finally语句被执行");
		}
		
//		throw new Exception();
//		return "郑旭正常结束";
	}

}
