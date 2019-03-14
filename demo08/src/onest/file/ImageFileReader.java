package onest.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageFileReader {
	
	public static void main(String[] args) {
		File file = new File("D://a.jpg");
		File fileResult = new File("D://b.jpg");
		try {
			fileResult.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(fileResult);
			int read = fis.read();
			while(read!=-1) {
//				System.out.println(read);
//				System.out.print("a");
				fos.write(read);
				read= fis.read();
			}
			fis.close();
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
