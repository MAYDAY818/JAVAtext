package demo05;

public class Outer2 {
	private String name;
	
	Thread t = new Thread() {
		@Override
		public void run() {
			System.out.println("打印一句话");
		}
	};
	
	public void display() {
		int i=1;
		boolean flag =true;
		if(flag) {
			for(i=1;i<10;i++) {
				System.out.println(i);
			}
		}
		class Inner2 extends Thread{
			@Override
			public void run() {
				System.out.println("打印一句话");
			}
		}
		Inner2 inner2 = new Inner2();
		inner2.run();
		
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("打印一句话");
			}
		};
		t.run();
	}
	
	public void display2(Thread t) {
		t.run();
	}

}
