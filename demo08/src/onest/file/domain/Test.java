package onest.file.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//			Student student = new Student();
//			student.setName("张三");
//			student.setSno("201215121");
//			
//			File file = new File("D://a.obj");
////			file.createNewFile();
//			FileOutputStream fos = new FileOutputStream(file);
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(student);
		//对象的反序列化
		File file = new File("D://a.obj");
		FileInputStream fis = new FileInputStream(file);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Student s =(Student)obj;
		System.out.println(s.getName());
		System.out.println(s.getSno());
			
			
	}

}
