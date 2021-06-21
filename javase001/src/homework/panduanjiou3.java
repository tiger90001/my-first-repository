package homework;

import java.util.Scanner;

public class panduanjiou3 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
