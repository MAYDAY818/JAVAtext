package onest.file;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		File file = new File("D://aaa.txt");
//		if(file.exists()) {
//			System.out.println("文件存在");
//		}else {
//			System.out.println("文件不存在");
//			try {
//				boolean result = file.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		File file2 = new File("D://aaa/aaa/aaa/");
		if(!file2.exists()) {
			boolean result = file2.mkdirs 	();
			System.out.println(result);
		}
	}

}
