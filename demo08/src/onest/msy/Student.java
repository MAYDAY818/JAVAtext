package onest.msy;

public class Student implements Comparable<Student>{
	private String sno;
	private String sname;
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
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		if(this.sname!=null && this.sno!=null)
		{
			int hashCode1 = this.sname.hashCode();
			int hashCode2 = this.sno.hashCode();
			return hashCode1+hashCode2;
		}
		return super.hashCode();
	}
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Student) {
			Student s =(Student)o;
			if(s.getSname().equals(this.sname)&& s.getSno().equals(this.sno)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(this.sno!=null && s.sno!=null) {
			int result = this.sno.compareTo(s.sno);
			return result;
		}else if(this.sno==null && s.sno==null){
			return 0;
		}else if(this.sno==null && s.sno!=null){
			return 2;
		}else {
			return -2;
		}
	}
	

}
