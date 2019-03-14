package demo10;

public class Task2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = this.getName();
		
		for(int i=0;i<50;i++) {
			System.out.println(name+" 我在执行任");
		}
	}
}
