package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO 自动生成的方法存根
		DatagramSocket ds=new DatagramSocket();
		while(true) {
			String s= new String("111111");
			byte[] buf=s.getBytes();
			DatagramPacket dp = new DatagramPacket(buf,7777,InetAddress.getLocalHost() ,buf.length);
			ds.send(dp);
			Thread.sleep(2000);
		}
	}
}
