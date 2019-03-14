package demo15;

public class Student {
	public String sno;
	public String sname;
	
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student() {
		
	}
	public Student(String sno) {
		this.sno=sno;
	}
	public void study(String course) {
		System.out.println("Ñ§Ï°£º"+course);
	}

}
