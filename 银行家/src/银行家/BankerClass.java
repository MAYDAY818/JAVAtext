package ���м�;

import java.util.Scanner;

public class BankerClass {

	int num = 0;//���̱��
    Scanner sc = new Scanner(System.in);
    
    int n;//�������
    int m;//��Դ�������
    int[] Available;//������Դʣ��ĸ���
    int[][] Max;//ÿ����������������
    int[][] Alloction;//�Ѿ��������Դ
    int[][] Need;//����Ҫ����Դ
    int[][] Request;
    int[] Work;

    public BankerClass() {
    	System.out.println("��������Ҫ������Դ");
    	m = sc.nextInt();
    	System.out.println("��������Ҫ��������");
    	n = sc.nextInt();
        Available = new int[m];//������Դʣ��ĸ���
        Max = new int[n][m];//ÿ����������������
        Alloction = new int[n][m];//�Ѿ��������Դ
        Need = new int[n][m];//����Ҫ����Դ
        Request = new int[n][m];
        Work = new int[n];
        for(int i =0;i<m;i++) {
    		System.out.println("�������"+(i+1)+"����Դ������");
    		Available[i]=sc.nextInt();
    	}
    }
    public void setSystemVariable(){//���ø���ʼϵͳ���������ж��Ƿ��ڰ�ȫ״̬��
        setMax();
        setAlloction();
        printSystemVariable();
        SecurityAlgorithm();
    }

    public void setMax() {//����Max����
        //System.out.println("�����ø����̵�����������Max��");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            	System.out.println("���������P" + (i+1) + "�ĵ�"+(j+1)+"����Դ�����Դ��������");
                Max[i][j] = sc.nextInt();
            }
        }
    }

    public void setAlloction() {//�����ѷ������Alloction
        System.out.println("��������������Ѿ��������Դ��");
        for (int i = 0; i < n; i++) {
            System.out.println("���������P" + (i+1) + "�ķ�����Դ����");
            for (int j = 0; j < m; j++) {
            	System.out.println("���������P" + (i+1) + "�ĵ�"+(j+1)+"����Դ��ӵ�е�������");
                Alloction[i][j] = sc.nextInt();
            }
        }
        System.out.println("Need=Max-Alloction.");//�Զ�����ʣ�����Դ����
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Available[i] = Available[i] - Alloction[j][i];
            }
        }
        for (int i = 0; i < n; i++) {//����Need����
            for (int j = 0; j < m; j++) {
                Need[i][j] = Max[i][j] - Alloction[i][j];
            }
        }
    }

    public void printSystemVariable(){
        System.out.println("��ʱ��Դ���������£�");
        System.out.println("����  "+"   Max   "+"   Alloction "+"    Need  "+"     Available ");
        for(int i=0;i<n;i++){
            System.out.print("P"+(i+1)+"  ");
            for(int j=0;j<m;j++){
               System.out.print(Max[i][j]+"  "); 
            }
            System.out.print("|  ");
            for(int j=0;j<m;j++){
               System.out.print(Alloction[i][j]+"  "); 
            }
            System.out.print("|  ");
            for(int j=0;j<m;j++){
               System.out.print(Need[i][j]+"  "); 
            }
            System.out.print("|  ");
            if(i==0){
                for(int j=0;j<3;j++){
                    System.out.print(Available[j]+"  ");
                }
            }
            System.out.println();
        }
    }

    public void setRequest() {//����������Դ��Request


        System.out.println("������������Դ�Ľ��̱�ţ�(��1��ʼ)");
        num= sc.nextInt()-1;//����ȫ�ֱ������̱��num
        System.out.println("�������������Դ��������");
        for (int j = 0; j < m; j++) {
            Request[num][j] = sc.nextInt();
        }
        System.out.println("����P" + (num+1) + "�Ը���Դ���������");
        for(int i = 0 ; i<m;i++) {
        	System.out.println(Request[num][i]);
        }
        BankerAlgorithm();
    }

    public void BankerAlgorithm() {//���м��㷨
        boolean T=true;
        boolean q=true;
        for(int i=0 ; i<m;i++) {
        	if(Request[num][i]<=Need[num][i]);
        	else
        		q=false;
        }
        boolean w=true;
        for(int i=0 ; i<m;i++) {
        	if(Request[num][i]<=Available[i]);
        	else
        		w=false;
        }
        if (q) {//�ж�Request�Ƿ�С��Need
            if (w) {//�ж�Request�Ƿ�С��Alloction
                for (int i = 0; i < m; i++) {
                    Available[i] -= Request[num][i];
                    Alloction[num][i] += Request[num][i];
                    Need[num][i] -= Request[num][i];
                }
            } else {
                System.out.println("��ǰû���㹻����Դ�ɷ��䣬����P" + (num+1) + "��ȴ���");
               T=false;
            }
        } else {
            System.out.println("����P" + (num+1) + "�����Ѿ��������������Need.");
            T=false;
        }

       if(T==true){
        printSystemVariable(); 
        SecurityAlgorithm();
       }
    }


    public void SecurityAlgorithm() {//��ȫ�㷨
        boolean[] Finish = new boolean[n];//��ʼ��Finish
        for(int i = 0 ;i<n;i++)
        	Finish[i]=false;
        int count = 0;//��ɽ�����
        int circle=0;//ѭ��Ȧ��
        int[] S=new int[n];//����ִ�е�˳��
        for (int i = 0; i < m; i++) {//�����洢������Դ��������
            Work[i] = Available[i];
        }
        boolean flag = true;
        while (count < n) {
            if(flag){
                System.out.println("����  "+"   Work  "+"   Alloction "+"    Need  "+"     Work+Alloction ");
                flag = false;
            }
            for (int i = 0; i < n; i++) {
            	boolean e=true;
            	for(int r = 0;r<m;r++) {
            		if(Need[i][r]<=Work[r]);
            		else
            			e=false;
            	}
                if (Finish[i]==false&&e) {//�ж�����
                    System.out.print("P"+(i+1)+"  ");
                    for (int k = 0; k < m; k++){
                        System.out.print(Work[k]+"  ");
                    }
                    System.out.print("|  ");
                    for (int j = 0; j<m;j++){
                    Work[j]+=Alloction[i][j];
                    }
                    Finish[i]=true;//����ǰ����������ʱ
                    S[count]=i+1;//���õ�ǰ�����ź�

                    count++;//�����������1
                    for(int j=0;j<3;j++){
                       System.out.print(Alloction[i][j]+"  "); 
                    }
                    System.out.print("|  ");
                    for(int j=0;j<m;j++){
                       System.out.print(Need[i][j]+"  "); 
                    }
                    System.out.print("|  ");
                    for(int j=0;j<m;j++){
                       System.out.print(Work[j]+"  "); 
                    }
                    System.out.println();
                }

            }
            circle++;//ѭ��Ȧ����1

            if(count==n){//�ж��Ƿ��������н�����Ҫ
                System.out.print("��ʱ����һ����ȫ���У�");
                for (int i = 0; i<3;i++){//�����ȫ����
                    System.out.print("P"+S[i]+" ");
                }
                System.out.println("����ִ��");
                break;//����ѭ��
            }
            if(count<circle){//�ж���ɽ������Ƿ�С��ѭ��Ȧ��
                count=5;
                System.out.println("��ǰϵͳ���ڲ���ȫ״̬���ʲ����ڰ�ȫ���С�");
                break;//����ѭ��
            }
        }
    }

}