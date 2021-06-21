package homework;


import java.util.Random;
import java.util.Scanner;

public class caishuzi15 {
    public static void main(String[] args) {
       Random rm=new Random();
       int i=rm.nextInt(100)+1;
       System.out.println("请输入一个1~100的整数");
       Scanner sc=new Scanner(System.in);
       while (true) {
           int j = sc.nextInt();
           if (j>i){System.out.println("大了");}
           if (j<i){System.out.println("小了");}
           if (j==i){System.out.println("对了");break;}
       }System.out.println(i);
    }
}