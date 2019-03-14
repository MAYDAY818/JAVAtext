package onest.file.domain;

import java.io.Serializable;

public class Student implements Serializable{
	private transient String name;
	private String sno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	
}
