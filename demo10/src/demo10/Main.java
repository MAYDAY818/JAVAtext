package demo10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("开始执行：");
			Thread thread= new Thread(new Println());
			thread.setPriority(Thread.MAX_PRIORITY);
			System.out.println(thread.isAlive());
			System.out.println("thread的优先级是："+thread.getPriority());
			
			thread.setName("aaa");
			thread.start();
			System.out.println(thread.isAlive());
//			thread.run();
			
			Thread thread2 = new Task2();
			thread2.setPriority(Thread.MIN_PRIORITY);
			System.out.println("thread2的优先级是："+thread2.getPriority());
			thread2.setName("bbb");
			thread2.start();
//			thread2.run();
			Thread t = Thread.currentThread();
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<100;i++) {
				System.out.println(t.getName()+" main线程打印 您好！");
			}
			
//			thread.start();
			
	}

}
