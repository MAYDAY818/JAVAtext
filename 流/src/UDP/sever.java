package UDP;

import java.io.IOException;
import java.net.*;


public class sever {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		DatagramSocket ds=new DatagramSocket(7777);
		byte[] buf = new byte[1024];
		while(true) {
			DatagramPacket dp = new DatagramPacket(buf, 0);
			ds.receive(dp);
			String s=new String(buf);
			System.out.println(s);
			}
	}

}
