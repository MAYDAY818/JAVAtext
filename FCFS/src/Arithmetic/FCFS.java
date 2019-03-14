package Arithmetic;  
  
import java.io.*;
import java.util.Scanner;
  
public class FCFS {  
  
    public static int i;  
    public double awara[];  
    public double awara1[];  
    public int process_number;  //项目个数
    public double arrival_time[];  //到达时间
    public double services_time[];  //服务时间
    public double start_time[];  //开始时间
    public double wait_time[];  //等待时间
    public double completion_time[]; //完成时间 
    public double turn_around_time[];  //周转时间
    public double turn_around_time_with_weight[];  //带权周转时间
    public double average_turnaround_time=0;  //平均周转时间
    public double average_turn_around_time_with_weight; //平均带权按周转时间

    private void do_FCFS() {  
  
        start_time[0] = arrival_time[0];  
        completion_time[0] = arrival_time[0] + services_time[0];  
        start_time[0] = arrival_time[0];  
        turn_around_time[0] = completion_time[0] - arrival_time[0];  
        turn_around_time_with_weight[0] = turn_around_time[0] / services_time[0];  
        for (i = 1; i < process_number; i++) {  
            start_time[i] = completion_time[i - 1];  
            wait_time[i] = start_time[i] - arrival_time[i];  
            completion_time[i] = arrival_time[i] + services_time[i] + wait_time[i];  
            turn_around_time[i] = completion_time[i] - arrival_time[i];  
            turn_around_time_with_weight[i] = turn_around_time[i] / services_time[i];  
  
        } 

        System.out.println("\n：开始时间是： ");  
        for (i = 0; i < process_number; i++) {  
            System.out.print(start_time[i] + "\t");  
        }  
        
        System.out.println("\n等待时间是：");  
        for (i = 0; i < process_number; i++) {  
            System.out.print(wait_time[i] + "\t");  
        }  
        
        System.out.println("\n完成时间是：");  
        for (i = 0; i < process_number; i++) {  
            System.out.print(completion_time[i] + "\t");  
        }
        
        System.out.println("\n周转时间是：");  
        for (i = 0; i < process_number; i++) {  
            System.out.print(turn_around_time[i] + "\t");  
            average_turnaround_time=average_turnaround_time+turn_around_time[i];
        }  
        
        
        System.out.println("\n平均周转时间是：");  
        System.out.print(average_turnaround_time/process_number + "\t"); 
        
        System.out.println("\n带权周转时间：");    
        for (i = 0; i < process_number; i++) {  
            System.out.print(turn_around_time_with_weight[i] + "\t");
            average_turn_around_time_with_weight=average_turn_around_time_with_weight+turn_around_time_with_weight[i];
        }  
        
        System.out.println("\n平均带权周转时间是：");  
        System.out.print(average_turn_around_time_with_weight/process_number + "\t"); 
    }  
  
    
    //程序主体
    public static void main(String[] args) throws Exception {  
    	Scanner sc = new Scanner(System.in);
        System.out.println("请输入总共有多少进程数：");  
        FCFS cok = new FCFS();   
        int i=sc.nextInt();
        cok.process_number = i; 
        cok.arrival_time = new double[i];  
        cok.services_time = new double[i];  
        cok.completion_time = new double[i];  
        cok.turn_around_time = new double[i];  
        cok.start_time = new double[i];  
        cok.wait_time = new double[i];  
        cok.turn_around_time_with_weight = new double[i];  
  
        int m;  
        int n;  
  
        System.out.println("\n请输入各进程到达时间");  
        for (i = 0; i < cok.process_number; i++) {  
            m = sc.nextInt();  
            cok.arrival_time[i] = m;  
        }  
  
        System.out.println("\n请输入各个进程服务时间");  
        for (i = 0; i < cok.process_number; i++) {  
            n = sc.nextInt();  
            cok.services_time[i] = n;  
  
        }  
        System.out.println("该进程数为" + cok.process_number);  
        System.out.println("\n到达时间为");  
        for (i = 0; i < cok.process_number; i++) {  
            System.out.print(cok.arrival_time[i] + "\t");  
        }  
        System.out.println("\n服务时间为：");  
        for (i = 0; i < cok.process_number; i++) {  
            System.out.print(cok.services_time[i] + "\t");  
        }  
        cok.do_FCFS();  
  
    }  
  
}  
