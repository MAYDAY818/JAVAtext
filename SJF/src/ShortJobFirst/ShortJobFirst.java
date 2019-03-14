package ShortJobFirst;

import java.util.Scanner;

import Arithmetic.FCFS;

public class ShortJobFirst {    
    
    public static float minAgerageWaitTime(int[] requestTime, int[] durationTime){    
            
        int length = requestTime.length;    
            
        int[] serviceTime = new int[length];  //服务时间 
        for(int i=0; i<length; i++){    
            serviceTime[i] = durationTime[i];      
        }    
            
        int[] task = new int[length];  //任务编号
        for(int i=0; i<length; i++){    
            task[i] = i+1;    
        }    
        int[] waitTime = new int[length];  //等待时间    
        int[] startTime = new int[length]; //开始时间    
        int[] finishTime = new int[length]; //完成时间    
        int[] turnTime = new int[length];   //周转时间    
        float[] rightTurnTime = new float[length];  //带权周转时间    
        double averageturnaroundtime;  //平均周转时间
        double averageturnaroundtimewithweight; //平均带权按周转时间
            
        startTime[0] = requestTime[0];    
        finishTime[0] = startTime[0] + durationTime[0];    
        waitTime[0] = startTime[0] - requestTime[0];    
        turnTime[0] = finishTime[0] - requestTime[0];    
        rightTurnTime[0] =(float) turnTime[0] / durationTime[0];    
 
        int minIndex = 0;    
        int lastIndex = 0;    
        int[] durations =  getMin( requestTime,serviceTime);  //得到任务调动的顺序    
        for(int i=1; i<length; i++){    
            minIndex = durations[i-1]+1;    
            startTime[minIndex] = finishTime[lastIndex];   //开始时间 = task == 0 ? 0 : 上个优选任务的完成时间     
            finishTime[minIndex] = startTime[minIndex] + durationTime[minIndex]; //完成时间 = 开始时间 + 服务时间    
            waitTime[minIndex] = startTime[minIndex] - requestTime[minIndex];    //等待时间 = 开始时间 - 提交时间    
            turnTime[minIndex] = finishTime[minIndex] - requestTime[minIndex];   //周转时间 = 完成时间 - 提交时间    
            rightTurnTime[minIndex] = (float)turnTime[minIndex] / durationTime[minIndex];  //带权周转时间 = 周转时间 / 服务时间    
            lastIndex = minIndex;  //将当前索引记为上一个任务索引    
        }    
   
        int add = 0;    
        float result;       
        for(int i=0; i< length; i++){    
            add += waitTime[i];    
        }    
        result = (float)add/length;  //求平均等待时间  
        return result;  
    }    
        
  
    private static int[] getMin(int[] requstTime, int[] durationTime) {    
            
        int length = durationTime.length;    
        int[] arr = new int[length-1];  //去除第一个任务，剩下的任务的服务时间    
        int[] arr1 = new int[length-1]; //存放剩下任务的开始顺序索引    
        int[] arr2 = new int[length-1]; //存放剩下任务的开始顺序值    
        for(int i=0; i<arr.length ; i++){    
            arr[i] = durationTime[i+1];    
        }    
            
        int minIndex =0;      
        for(int i=0; i<arr.length; i++){  //趟数    
            for(int j=0 ; j<arr.length; j++){  //冒泡比较    
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
        System.out.println("请输入总共有多少进程数：");  
        int length=sc.nextInt();
        int m,n;
        int[] requestTime = new int [length];    
        int[] durationTime = new int [length];           
        System.out.println("\n请输入各进程到达时间");  
        for (int i = 0; i < length; i++) {  
            m = sc.nextInt();  
            requestTime[i] = m;  
        }  
  
        System.out.println("\n请输入各个进程服务时间");  
        for (int i = 0; i < length; i++) {  
            n = sc.nextInt();  
            durationTime[i] = n;  
        }  
        float averageWaitTime = ShortJobFirst.minAgerageWaitTime(requestTime, durationTime);                           
  
        System.out.println("平均等待时间：" + averageWaitTime );    
            
    }    
}