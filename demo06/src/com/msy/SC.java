package com.msy;

public class SC {
	private Student student;
	private Course course;
	private Grade grade= Grade.A;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	public String getP() {
		String result = null;
		switch (grade) {
		case A:
			result="成绩优秀";
			break;
		case B:
			result="成绩良好";
			break;
		case C:
			result="成绩中等";
			break;
		case D:
			result="成绩及格";
			break;
		case E:
			result="成绩差";
			break;
		default:
			break;
		}
		return result;
	}
	
}
