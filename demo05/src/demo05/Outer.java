package demo05;

public class Outer {
	public String name;
	public void display() {
		System.out.println("outer dispaly");
		Inner inner = new Inner();
		inner.name="";
		inner.innerDisplay("");
	}
	public  class Inner{
		public  String name;
		public void innerDisplay(String name) {
			this.name=name;
			Outer.this.name=name;
			System.out.println("inner display");
		}
	}

}
