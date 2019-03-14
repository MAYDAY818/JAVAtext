package IO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.Scanner;

public class socketclient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1",9999);
		InputStream is = socket.getInputStream();
		BufferedWriter br = new BufferedWriter(new InputStream(bw));
		Scanner sc = new Scanner(System.in);
		String readLine = br.readLine();
		while(!"bye".equals(readLine)) {
			br.write(nextLine);
		}
	}
}
