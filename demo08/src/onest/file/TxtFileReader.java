package onest.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建文件输入流
		 File file = new File("D://test.txt");
		 FileReader r = new FileReader(file);
		 BufferedReader br = new BufferedReader(r);
		 
		 //创建文件
		 File filecopy = new File("D://testcopy2.txt");

		 FileWriter fw =null;
		 if(!filecopy.exists()) {
			filecopy.createNewFile();
		 }
		 
		fw = new FileWriter(filecopy);	
		BufferedWriter bw = new BufferedWriter(fw);
//		 int read = r.read();
//		 while(read!=-1) {
//			 read=r.read();
//			 fw.append((char)read);
//			 System.out.print((char)read);
//		 }
		
		String readLine = br.readLine();
		while(readLine!=null) {
			bw.write(readLine);
			readLine = br.readLine();
		}
//		 fw.append("追加的内容");
		
//		 fw.flush();
		 bw.flush();		
		 fw.close();
		 r.close();
		 br.close();
		 bw.close();
	}

}
