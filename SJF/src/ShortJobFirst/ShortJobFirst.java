package ShortJobFirst;

import java.util.Scanner;

import Arithmetic.FCFS;

public class ShortJobFirst {    
    
    public static float minAgerageWaitTime(int[] requestTime, int[] durationTime){    
            
        int length = requestTime.length;    
            
        int[] serviceTime = new int[length];  //����ʱ�� 
        for(int i=0; i<length; i++){    
            serviceTime[i] = durationTime[i];      
        }    
            
        int[] task = new int[length];  //������
        for(int i=0; i<length; i++){    
            task[i] = i+1;    
        }    
        int[] waitTime = new int[length];  //�ȴ�ʱ��    
        int[] startTime = new int[length]; //��ʼʱ��    
        int[] finishTime = new int[length]; //���ʱ��    
        int[] turnTime = new int[length];   //��תʱ��    
        float[] rightTurnTime = new float[length];  //��Ȩ��תʱ��    
        double averageturnaroundtime;  //ƽ����תʱ��
        double averageturnaroundtimewithweight; //ƽ����Ȩ����תʱ��
            
        startTime[0] = requestTime[0];    
        finishTime[0] = startTime[0] + durationTime[0];    
        waitTime[0] = startTime[0] - requestTime[0];    
        turnTime[0] = finishTime[0] - requestTime[0];    
        rightTurnTime[0] =(float) turnTime[0] / durationTime[0];    
 
        int minIndex = 0;    
        int lastIndex = 0;    
        int[] durations =  getMin( requestTime,serviceTime);  //�õ����������˳��    
        for(int i=1; i<length; i++){    
            minIndex = durations[i-1]+1;    
            startTime[minIndex] = finishTime[lastIndex];   //��ʼʱ�� = task == 0 ? 0 : �ϸ���ѡ��������ʱ��     
            finishTime[minIndex] = startTime[minIndex] + durationTime[minIndex]; //���ʱ�� = ��ʼʱ�� + ����ʱ��    
            waitTime[minIndex] = startTime[minIndex] - requestTime[minIndex];    //�ȴ�ʱ�� = ��ʼʱ�� - �ύʱ��    
            turnTime[minIndex] = finishTime[minIndex] - requestTime[minIndex];   //��תʱ�� = ���ʱ�� - �ύʱ��    
            rightTurnTime[minIndex] = (float)turnTime[minIndex] / durationTime[minIndex];  //��Ȩ��תʱ�� = ��תʱ�� / ����ʱ��    
            lastIndex = minIndex;  //����ǰ������Ϊ��һ����������    
        }    
   
        int add = 0;    
        float result;       
        for(int i=0; i< length; i++){    
            add += waitTime[i];    
        }    
        result = (float)add/length;  //��ƽ���ȴ�ʱ��  
        return result;  
    }    
        
  
    private static int[] getMin(int[] requstTime, int[] durationTime) {    
            
        int length = durationTime.length;    
        int[] arr = new int[length-1];  //ȥ����һ������ʣ�µ�����ķ���ʱ��    
        int[] arr1 = new int[length-1]; //���ʣ������Ŀ�ʼ˳������    
        int[] arr2 = new int[length-1]; //���ʣ������Ŀ�ʼ˳��ֵ    
        for(int i=0; i<arr.length ; i++){    
            arr[i] = durationTime[i+1];    
        }    
            
        int minIndex =0;      
        for(int i=0; i<arr.length; i++){  //����    
            for(int j=0 ; j<arr.length; j++){  //ð�ݱȽ�    
                if(arr[j] < arr[minIndex]){    
                    minIndex = j;    
                }    
            }    
            arr1[i] = minIndex;    
            arr2[i] = arr[minIndex];    
            arr[minIndex] = Integer.MAX_VALUE;    
        }    
        return arr1;    
            
    }    
    
    public static void main(String[] args) {      
    	Scanner sc = new Scanner(System.in);
        System.out.println("�������ܹ��ж��ٽ�������");  
        int length=sc.nextInt();
        int m,n;
        int[] requestTime = new int [length];    
        int[] durationTime = new int [length];           
        System.out.println("\n����������̵���ʱ��");  
        for (int i = 0; i < length; i++) {  
            m = sc.nextInt();  
            requestTime[i] = m;  
        }  
  
        System.out.println("\n������������̷���ʱ��");  
        for (int i = 0; i < length; i++) {  
            n = sc.nextInt();  
            durationTime[i] = n;  
        }  
        float averageWaitTime = ShortJobFirst.minAgerageWaitTime(requestTime, durationTime);                           
  
        System.out.println("ƽ���ȴ�ʱ�䣺" + averageWaitTime );    
            
    }    
}