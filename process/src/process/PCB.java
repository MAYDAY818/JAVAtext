package process;

public class PCB {
	int name, surper, rtime, ntime, utime;
	char state;

	PCB() {
	};

	PCB(int name, int surper, int ntime, int rtime) {
		this.name = name;
		this.surper = surper;
		this.rtime = rtime;
		this.ntime = ntime;
		utime = 0;
		state = 'W';
	}

	void display() {
		System.out.println(" name : " + name + " surper :" + surper + "ntime :" + ntime + "utime :" + utime + "state:"
				+ "rtime" + rtime);

	}
}