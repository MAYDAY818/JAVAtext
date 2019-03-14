package com.msy;

public enum Grade {
	
	A("a"),B("b"),C("c"),D("d"),E("e");
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
