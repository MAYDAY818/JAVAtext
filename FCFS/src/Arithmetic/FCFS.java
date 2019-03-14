package Arithmetic;  
  
import java.io.*;
import java.util.Scanner;
  
public class FCFS {  
  
    public static int i;  
    public double awara[];  
    public double awara1[];  
    public int process_number;  //��Ŀ����
    public double arrival_time[];  //����ʱ��
    public double services_time[];  //����ʱ��
    public double start_time[];  //��ʼʱ��
    public double wait_time[];  //�ȴ�ʱ��
    public double completion_time[]; //���ʱ�� 
    public double turn_around_time[];  //��תʱ��
    public double turn_around_time_with_weight[];  //��Ȩ��תʱ��
    public double average_turnaround_time=0;  //ƽ����תʱ��
    public double average_turn_around_time_with_weight; //ƽ����Ȩ����תʱ��

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

        System.out.println("\n����ʼʱ���ǣ� ");  
        for (i = 0; i < process_number; i++) {  
            System.out.print(start_time[i] + "\t");  
        }  
        
        System.out.println("\n�ȴ�ʱ���ǣ�");  
        for (i = 0; i < process_number; i++) {  
            System.out.print(wait_time[i] + "\t");  
        }  
        
        System.out.println("\n���ʱ���ǣ�");  
        for (i = 0; i < process_number; i++) {  
            System.out.print(completion_time[i] + "\t");  
        }
        
        System.out.println("\n��תʱ���ǣ�");  
        for (i = 0; i < process_number; i++) {  
            System.out.print(turn_around_time[i] + "\t");  
            average_turnaround_time=average_turnaround_time+turn_around_time[i];
        }  
        
        
        System.out.println("\nƽ����תʱ���ǣ�");  
        System.out.print(average_turnaround_time/process_number + "\t"); 
        
        System.out.println("\n��Ȩ��תʱ�䣺");    
        for (i = 0; i < process_number; i++) {  
            System.out.print(turn_around_time_with_weight[i] + "\t");
            average_turn_around_time_with_weight=average_turn_around_time_with_weight+turn_around_time_with_weight[i];
        }  
        
        System.out.println("\nƽ����Ȩ��תʱ���ǣ�");  
        System.out.print(average_turn_around_time_with_weight/process_number + "\t"); 
    }  
  
    
    //��������
    public static void main(String[] args) throws Exception {  
    	Scanner sc = new Scanner(System.in);
        System.out.println("�������ܹ��ж��ٽ�������");  
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
  
        System.out.println("\n����������̵���ʱ��");  
        for (i = 0; i < cok.process_number; i++) {  
            m = sc.nextInt();  
            cok.arrival_time[i] = m;  
        }  
  
        System.out.println("\n������������̷���ʱ��");  
        for (i = 0; i < cok.process_number; i++) {  
            n = sc.nextInt();  
            cok.services_time[i] = n;  
  
        }  
        System.out.println("�ý�����Ϊ" + cok.process_number);  
        System.out.println("\n����ʱ��Ϊ");  
        for (i = 0; i < cok.process_number; i++) {  
            System.out.print(cok.arrival_time[i] + "\t");  
        }  
        System.out.println("\n����ʱ��Ϊ��");  
        for (i = 0; i < cok.process_number; i++) {  
            System.out.print(cok.services_time[i] + "\t");  
        }  
        cok.do_FCFS();  
  
    }  
  
}  
