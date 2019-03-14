package FFdemo;

import java.util.*;  

public class FFMain {  
	static Scanner sc = new Scanner(System.in);
    private static class Node {  
        int id;    // ��ҵ���,Ϊ-1������з���;����0�����ѷ���  
        int start; // ʼַ  
        int size;  // ��С  
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
    // �����ڴ�  
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
    // �����ڴ�,
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
        System.out.println( "�ѷ������:" );  
        int i = 1;  
        for( Node temp : list ) {  
            if( temp.id != -1 ) System.out.println( "������:" + i + " �������:" +  temp  );  
            i++;  
        }  
        i = 1;  
        System.out.println( "δ�������:" );  
        for( Node temp : list ) {  
            if( temp.id == -1 ) System.out.println( "������:" + i + " �������:" + temp );  
            i++;  
        }  
    }  
    public static void main( String[] args ) {  
        List<Node> list = init();  
        int id, size, op;  
        while( true ) {  
            System.out.println( "   1: �����ڴ�        2: �ͷ��ڴ�    3: �˳�    ");   
            System.out.print( "���������: " );  
            op = sc.nextInt();  
            switch(op) {  
                case 1:  
                    System.out.print( "��������ҵid����ҵ��Сsize: " );  
                    id = sc.nextInt(); 
                    size = sc.nextInt();  
                    add( list, id, size ) ;
                    System.out.println( "����ɹ�" );
                    show( list ); 
                    break;  
                case 2:  
                    System.out.print( "��������Ҫ��������ҵid: " );  
                    id = sc.nextInt();  
                    del( list, id ) ;
                    System.out.println( "�����ɹ�" );  
                    show( list );
                    break;   
                case 3: return ;  
            }  
        }  
    }  
}  
