package 枚举;

public class text {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		student s1 = new student("张三",76,98,78);
		student s2 = new student("李四",56,34,78);
		student s3 = new student("王五",76,78,78);
		student s4 = new student("赵六",76,25,78);
		student s5 = new student("王麻子",76,39,78);
		student s6 = new student("张小兵",76,38,78);
		student s7 = new student("李小芳",76,87,78);
		student s8 = new student("张",76,98,17);
		student s9 = new student("王",76,98,56);
		student s10 = new student("李",76,29,78);
		student[] students=new student[10];
		students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;
        students[5] = s6;
        students[6] = s7;
        students[7] = s8;
        students[8] = s9;
        students[9] = s10;
        int a1=0;
        int a2=0;
        int a3=0;
        int a4=0;
        for(int i = 0 ;i<=9;i++) {
        	switch(students[i].getS()){
        	case "A":
        		a1++;
        		break;
        	case "B":
        		a2++;
        		break;
        	case "C":
        		a3++;
        		break;
        	case "D":
        		a4++;
        		break;
        	}
        }
        double a = (a1*100)/10;
        double b = (a2*100)/10;
        double c = (a3*100)/10;
        double d = (a4*100)/10;
        System.out.println("A的比例为"+a+"%");
        System.out.println("B的比例为"+b+"%");
        System.out.println("C的比例为"+c+"%");
        System.out.println("D的比例为"+d+"%");
	}

}
