package IO;

import java.io.*;
import java.net.*;
import java.util.*;


public class socket {
	public static void main(String[] args) throws UnknownHostException, IOException  {
		ServerSocket server = new ServerSocket(9999);
		
		Socket socket = server.accept();
		OutputStream os = socket.getOutputStream();
		BufferedWriter bw = new BufferedWriter(new OutputStream(bw));
		Scanner sc = new Scanner(System.in);
		String nextLine = br.readLine();
		while(!"bye",equals(nextLine)) {
			bw.write(nextLine);
		}
	}
}
