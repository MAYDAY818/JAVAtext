package ö��;

public class text {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		student s1 = new student("����",76,98,78);
		student s2 = new student("����",56,34,78);
		student s3 = new student("����",76,78,78);
		student s4 = new student("����",76,25,78);
		student s5 = new student("������",76,39,78);
		student s6 = new student("��С��",76,38,78);
		student s7 = new student("��С��",76,87,78);
		student s8 = new student("��",76,98,17);
		student s9 = new student("��",76,98,56);
		student s10 = new student("��",76,29,78);
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
        System.out.println("A�ı���Ϊ"+a+"%");
        System.out.println("B�ı���Ϊ"+b+"%");
        System.out.println("C�ı���Ϊ"+c+"%");
        System.out.println("D�ı���Ϊ"+d+"%");
	}

}
