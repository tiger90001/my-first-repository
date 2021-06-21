package homework;

import java.util.Scanner;

public class chuzuchejifei4 {
    public static void main(String[] args){
        System.out.println("请输入里程数");
        Scanner sc=new Scanner(System.in);
        double s=sc.nextDouble();
        if(s>5){
            double fee=8+1.2*3+1.5*(s-5);
            System.out.println("您要付："+fee+"元");
        }else if(s>3){
            double fee=8+1.2*(s-3);
            System.out.println("您要付："+fee+"元");
        }else {
            double fee=8;
            System.out.println("您要付："+fee+"元");
        }
    }
}
