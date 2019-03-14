/*package IO;

import java.io.*;
import java.net.*;

public class liu {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根

		// URL url = new
		// URL("http://e.hiphotos.baidu.com/image/h%3D300/sign=ce18bf50dbca7bcb627bc12f8e086b3f/a2cc7cd98d1001e98517929cb40e7bec54e7977e.jpg");
		URL url = new URL("http://www.baidu.com/");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		int code = connection.getResponseCode();// 返回状态码

		// URLConnection connection = url.openConnection();
		InputStream is = connection.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		File file = new File("F:\\1.html");
		// FileOutputStream os = new FileOutputStream(file);
		FileWriter fw = new FileWriter(file);
		// int read = is .read();
		// while(read != -1) {
		// os.write(read);
		// read=is.read();
		// }
		// os.flush();
		// os.close();
		String wir = br.readLine();
		while (wir != null) {
			fw.write(wir);
			wir = br.readLine();
		}
		fw.flush();
		fw.close();
		is.close();
	}

}*/
