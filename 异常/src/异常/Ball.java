package “Ï≥£;

public class Ball {
	Ball(){
		number=1;
		model ="M45";
	}
	Ball(int n,String m){
		number=n;
		model=m;
	}
	public void display() {
		System.out.println(number+"-"+model);
	}
	int number;
	String model;
}
