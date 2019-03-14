package url;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ImgTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		URL url = new URL("http://y1.ifengimg.com/cmpp/2014/03/11/02/a034623a-1047-43f2-81f3-6e65524c5916.jpg");
		URL url = new URL("http://localhost:8080/bookshop/a");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		int code = connection.getResponseCode();
		Object content = connection.getContent();
		if(code==200) {
		InputStream is = connection.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		File file = new File("d://download.html");
//		FileOutputStream os = new FileOutputStream(file);
		FileWriter fw = new FileWriter(file);
//		int read = is.read();
//		while(read!=-1) {
//			os.write(read);
//			read = is.read();
//		}
//		System.out.println("图片下载完成");
//		os.flush();
//		os.close();
//		is.close();
		
		String readLine = br.readLine();
		while(readLine!=null) {
			fw.write(readLine);
			readLine = br.readLine();
		}
		fw.flush();
		fw.close();
		br.close();
		is.close();		
		}else if(code==500){
			System.out.println("您访问的资源异常");
		}else if(code==404){
			System.out.println("您访问的资源不存在");
		}
	}

}
