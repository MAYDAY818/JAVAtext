package 银行家;

import java.util.Scanner;

public class BankerClass {

	int num = 0;//进程编号
    Scanner sc = new Scanner(System.in);
    
    int n;//程序个数
    int m;//资源种类个数
    int[] Available;//所有资源剩余的个数
    int[][] Max;//每个程序的最大需求量
    int[][] Alloction;//已经分配的资源
    int[][] Need;//还需要的资源
    int[][] Request;
    int[] Work;

    public BankerClass() {
    	System.out.println("请输入需要几个资源");
    	m = sc.nextInt();
    	System.out.println("请输入需要几个进程");
    	n = sc.nextInt();
        Available = new int[m];//所有资源剩余的个数
        Max = new int[n][m];//每个程序的最大需求量
        Alloction = new int[n][m];//已经分配的资源
        Need = new int[n][m];//还需要的资源
        Request = new int[n][m];
        Work = new int[n];
        for(int i =0;i<m;i++) {
    		System.out.println("请输入第"+(i+1)+"个资源的总数");
    		Available[i]=sc.nextInt();
    	}
    }
    public void setSystemVariable(){//设置各初始系统变量，并判断是否处于安全状态。
        setMax();
        setAlloction();
        printSystemVariable();
        SecurityAlgorithm();
    }

    public void setMax() {//设置Max矩阵
        //System.out.println("请设置各进程的最大需求矩阵Max：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            	System.out.println("请输入进程P" + (i+1) + "的第"+(j+1)+"个资源最大资源需求量：");
                Max[i][j] = sc.nextInt();
            }
        }
    }

    public void setAlloction() {//设置已分配矩阵Alloction
        System.out.println("请设置请各进程已经分配的资源：");
        for (int i = 0; i < n; i++) {
            System.out.println("晴输入进程P" + (i+1) + "的分配资源量：");
            for (int j = 0; j < m; j++) {
            	System.out.println("请输入进程P" + (i+1) + "的第"+(j+1)+"个资源已拥有的数量：");
                Alloction[i][j] = sc.nextInt();
            }
        }
        System.out.println("Need=Max-Alloction.");//自动计算剩余的资源数量
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Available[i] = Available[i] - Alloction[j][i];
            }
        }
        for (int i = 0; i < n; i++) {//设置Need矩阵
            for (int j = 0; j < m; j++) {
                Need[i][j] = Max[i][j] - Alloction[i][j];
            }
        }
    }

    public void printSystemVariable(){
        System.out.println("此时资源分配量如下：");
        System.out.println("进程  "+"   Max   "+"   Alloction "+"    Need  "+"     Available ");
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

    public void setRequest() {//设置请求资源量Request


        System.out.println("请输入请求资源的进程编号：(从1开始)");
        num= sc.nextInt()-1;//设置全局变量进程编号num
        System.out.println("请输入请求各资源的数量：");
        for (int j = 0; j < m; j++) {
            Request[num][j] = sc.nextInt();
        }
        System.out.println("进程P" + (num+1) + "对各资源请求个数：");
        for(int i = 0 ; i<m;i++) {
        	System.out.println(Request[num][i]);
        }
        BankerAlgorithm();
    }

    public void BankerAlgorithm() {//银行家算法
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
        if (q) {//判断Request是否小于Need
            if (w) {//判断Request是否小于Alloction
                for (int i = 0; i < m; i++) {
                    Available[i] -= Request[num][i];
                    Alloction[num][i] += Request[num][i];
                    Need[num][i] -= Request[num][i];
                }
            } else {
                System.out.println("当前没有足够的资源可分配，进程P" + (num+1) + "需等待。");
               T=false;
            }
        } else {
            System.out.println("进程P" + (num+1) + "请求已经超出最大需求量Need.");
            T=false;
        }

       if(T==true){
        printSystemVariable(); 
        SecurityAlgorithm();
       }
    }


    public void SecurityAlgorithm() {//安全算法
        boolean[] Finish = new boolean[n];//初始化Finish
        for(int i = 0 ;i<n;i++)
        	Finish[i]=false;
        int count = 0;//完成进程数
        int circle=0;//循环圈数
        int[] S=new int[n];//序列执行的顺序
        for (int i = 0; i < m; i++) {//用来存储各个资源的现有量
            Work[i] = Available[i];
        }
        boolean flag = true;
        while (count < n) {
            if(flag){
                System.out.println("进程  "+"   Work  "+"   Alloction "+"    Need  "+"     Work+Alloction ");
                flag = false;
            }
            for (int i = 0; i < n; i++) {
            	boolean e=true;
            	for(int r = 0;r<m;r++) {
            		if(Need[i][r]<=Work[r]);
            		else
            			e=false;
            	}
                if (Finish[i]==false&&e) {//判断条件
                    System.out.print("P"+(i+1)+"  ");
                    for (int k = 0; k < m; k++){
                        System.out.print(Work[k]+"  ");
                    }
                    System.out.print("|  ");
                    for (int j = 0; j<m;j++){
                    Work[j]+=Alloction[i][j];
                    }
                    Finish[i]=true;//当当前进程能满足时
                    S[count]=i+1;//设置当前序列排号

                    count++;//满足进程数加1
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
            circle++;//循环圈数加1

            if(count==n){//判断是否满足所有进程需要
                System.out.print("此时存在一个安全序列：");
                for (int i = 0; i<3;i++){//输出安全序列
                    System.out.print("P"+S[i]+" ");
                }
                System.out.println("可以执行");
                break;//跳出循环
            }
            if(count<circle){//判断完成进程数是否小于循环圈数
                count=5;
                System.out.println("当前系统处于不安全状态，故不存在安全序列。");
                break;//跳出循环
            }
        }
    }

}