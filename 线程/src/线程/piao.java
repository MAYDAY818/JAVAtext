package �߳�;

public class piao extends Thread {
	public void run() {
		System.out.println("����"+this.toString());
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Thread thread1=new piao();
		Thread thread2=new piao();
		Thread thread3=new piao();
		Thread thread4=new piao();
		Thread thread5=new piao();
		Thread thread6=new piao();
		Thread thread7=new piao();
		Thread thread8=new piao();
		Thread thread9=new piao();
		Thread thread10=new piao();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
	}

}
