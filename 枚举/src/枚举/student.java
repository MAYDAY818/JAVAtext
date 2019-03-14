package Ã¶¾Ù;

public class student {

	public student(String na,int en,int ma,int pe) {
		this.name=na;
		this.english=en;
		this.math=ma;
		this.PE=pe;
		grade=(this.math+this.english+this.PE)/3;
		if(this.grade>=90)
			this.gra= Grade.A;
		else if(this.grade>=80)
			this.gra=Grade.B;
		else if(this.grade>=60)
			this.gra=Grade.C;
		else
			this.gra=Grade.D;
	}
	public String getS() {
		return gra.getS();
	}
	private String name;
	private int english;
	private int math;
	private int PE;
	private int grade;
	private Grade gra;
}
