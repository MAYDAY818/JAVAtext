package Ã¶¾Ù;


public enum Grade {
	A("A"),B("B"),C("C"),D("D");
	private Grade(String s){
		this.s=s;
	}
	String s;
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
}
