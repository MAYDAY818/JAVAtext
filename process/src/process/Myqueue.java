package process;
import java.util.Arrays;

public class Myqueue {
	int index1 = 0;
	int index2 = 0;
	PCB[] pc1 = new PCB[5];
	PCB[] pc2 = new PCB[5];

	public void enQueue(PCB process) {
		if (index1 >= 5) {
			System.out.println("满");
			return;
		}
		pc1[index1] = process;
		index1++;
	}

	public void deQueue(PCB process) {
		if (index2 >= 5) {
			System.out.println("满");
			return;
		}
		pc2[index2] = process;
		index2++;
	}

	public void sort() {

		PCB para = new PCB();
		for (int i = 0; i < pc1.length; i++) {
			for (int j = i; j < pc1.length; j++) {
				if (pc1[i].surper < pc1[j].surper) {
					para = pc1[i];
					pc1[i] = pc1[j];
					pc1[j] = para;
				}
			}
		}
	}

	public void display() {
		for (int i = 0; i < pc1.length; i++) {
			pc1[i].display();
		}

		for (int i = 0; i < index2; i++) {
			pc2[i].display();
		}
		System.out.println("一次调度分割线-----------------");

	}

	public void setagain() {
		for (int i = 0; i < pc1.length; i++) {
			pc1[i].state = 'W';
		}

	}

	public void run() {

		pc1[0].state = 'R';
		display();
		pc1[0].surper--;
		pc1[0].utime++;
		if (index1 == 1 && pc1[0].ntime == pc1[0].utime) {
			pc1[0].state = 'F';
			deQueue(pc1[0]);
			pc1 = Arrays.copyOf(pc1, 0);
			display();
			return;

		}
		if (pc1[0].ntime == pc1[0].utime) {
			pc1[0].state = 'F';
			deQueue(pc1[0]);
			pc1[0] = pc1[pc1.length - 1];
			pc1 = Arrays.copyOf(pc1, pc1.length - 1);
			sort();
			return;

		}
		sort();
		setagain();

	}

}