package ���м�;

import java.util.Scanner;

public class TestBankerClass {


    public static void main(String[] args) {
        // TODO code application logic here
        boolean Choose = true;
        String C;
        Scanner in = new Scanner(System.in);
        BankerClass T = new BankerClass();

        T.setSystemVariable();
        while (Choose == true) {
            T.setRequest();
            System.out.println("���Ƿ�Ҫ��������y/n?");
            C = in.nextLine();
            if (C=="n") {
                Choose = false;
            }
        }
    }
}