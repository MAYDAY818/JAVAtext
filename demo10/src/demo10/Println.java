package demo10;

public class Println implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		for(int i=0;i<100;i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(t.getName()+" ÄúºÃ£¡");
		}
	}

}
