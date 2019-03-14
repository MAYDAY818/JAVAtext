package 线程;

public class piao extends Thread {
	public void run() {
		System.out.println("窗口"+this.toString());
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
