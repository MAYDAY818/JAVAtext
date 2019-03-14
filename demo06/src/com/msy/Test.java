package com.msy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s =new Student();			
			s.setSno("2016111001");
			s.getName();
			s.getSno();
			s.setName("张三");
			s.setSex("男");
			s.setAge(19);
			Course c1 = new Course();
			c1.setCno("1");
			c1.setCname("JavaSE");
			c1.setCcridit(3);
			SC sc = new SC();
			sc.setStudent(s);
			sc.setCourse(c1);
			sc.setGrade(Grade.C);
			String l = sc.getP();
			System.out.println(l);
			try {
				int i=10/0;
				
				
			}catch (Exception e) {
				System.out.println("程序发生了异常，请退出，重来");
			}
			
	}

}
