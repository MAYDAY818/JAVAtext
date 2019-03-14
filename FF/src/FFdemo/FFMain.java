package FFdemo;

import java.util.*;  

public class FFMain {  
	static Scanner sc = new Scanner(System.in);
    private static class Node {  
        int id;    // 作业编号,为-1代表空闲分区;大于0代表已分配  
        int start; // 始址  
        int size;  // 大小  
        public String toString() {  
            return String.format( "[%4d, %4d, %4d]", id, start, size );  
        }  
    }  

    private static List<Node> init() {  
        List<Node> list = new ArrayList<Node>();  
        Node node = new Node();  
          

        node.id = -1;  
        node.start = 0;  
        node.size = 110;  
        list.add( node );  
          
        return list;  
    }  
    // 分配内存  
    private static boolean add( List<Node> list, int id, int size ) {  
        Node p = null;  
        int i = 0;  
        for( i = 0; i < list.size(); i++ ) {  
            p = list.get(i);  
            if( p.id==-1 && p.size>=size ) break;  
        }  
        if( i == list.size() ) return false; 
        
        Node temp = new Node();  
        temp.id = -1; temp.start = p.start+size;  
        temp.size = p.size-size;  
        list.add( i+1, temp );  
      
        p.id = id; 
        p.size = size;  
          
        return true;  
    }  
    // 回收内存,
    private static boolean del( List<Node> list, int id ) {  
        Node p = null;  
        int i;  
          

        for( i = 0; i < list.size(); i++ ) {  
            p = list.get(i);  
            if( p.id == id ) break;  
        }  
        if( i == list.size() ) return false;  
          
        p.id = -1; 
          
        Node a, b;  
        if( i != 0 ) {   
            a =  list.get(i-1); b = list.get(i);  
            if( a.id==-1 && b.id==-1 && a.start+a.size==b.start )  
              { a.size += b.size; list.remove( i ); i--; }  

        }  
        if( i != list.size()-1 ) { 
            a = list.get(i); b = list.get(i+1);  
            if( a.id==-1 && b.id==-1 && a.start+a.size==b.start )  
              { a.size += b.size; list.remove( i+1 ); }  
        }  
          
        return true;  
    }  
    private static void show( List<Node> list ) {  
        System.out.println( "已分配分区:" );  
        int i = 1;  
        for( Node temp : list ) {  
            if( temp.id != -1 ) System.out.println( "分区号:" + i + " 分配情况:" +  temp  );  
            i++;  
        }  
        i = 1;  
        System.out.println( "未分配分区:" );  
        for( Node temp : list ) {  
            if( temp.id == -1 ) System.out.println( "分区号:" + i + " 分配情况:" + temp );  
            i++;  
        }  
    }  
    public static void main( String[] args ) {  
        List<Node> list = init();  
        int id, size, op;  
        while( true ) {  
            System.out.println( "   1: 分配内存        2: 释放内存    3: 退出    ");   
            System.out.print( "请输入操作: " );  
            op = sc.nextInt();  
            switch(op) {  
                case 1:  
                    System.out.print( "请输入作业id和作业大小size: " );  
                    id = sc.nextInt(); 
                    size = sc.nextInt();  
                    add( list, id, size ) ;
                    System.out.println( "分配成功" );
                    show( list ); 
                    break;  
                case 2:  
                    System.out.print( "请输入需要撤销的作业id: " );  
                    id = sc.nextInt();  
                    del( list, id ) ;
                    System.out.println( "撤销成功" );  
                    show( list );
                    break;   
                case 3: return ;  
            }  
        }  
    }  
}  
