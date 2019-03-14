package “Ï≥£;

public class Gun {
	Gun(){
		number = 1;
		model = "M45";
		Quantityofloading = 6;
	}
	Gun(int n,String m,int q){
		number = n;
		model = m;
		Quantityofloading = q;
	}
	public void Loading() throws full
	{
		if(Cartridgeclip==Quantityofloading)
			throw new full();
		Cartridgeclip++;
	}
	public void Shooting() throws empty
	{
		if (Cartridgeclip==0)
			throw new empty();
		Cartridgeclip--;
	}
	public void display() {
		System.out.println(number+"-"+model);
	}
	int number;
	String model;
	int Cartridgeclip;
	int Quantityofloading;
	
}
