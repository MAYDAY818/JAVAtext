package process;

public class text {
	public static void main(String args[]) {
		Myqueue mq = new Myqueue();
		PCB[] pcb = { new PCB(1, 5, 1, 0), new PCB(2, 7, 2, 0), new PCB(3, 3, 2, 0), new PCB(4, 1, 1, 0),
				new PCB(5, 6, 2, 0) };
		for (int i = 0; i < 5; i++) {
			mq.enQueue(pcb[i]);
		}
		mq.sort();
		System.out.println("进程初始状态显示-----------------");
		mq.display();
		while (mq.index2 < 5) {
			mq.run();
		}
		for (int i = 0; i < 5; i++) {
			mq.pc2[i].display();
		}
	}

}