package homework;

import java.util.Scanner;

public class panduanzhengfu2 {
    public static void main(String[] args){
        System.out.println("请输入一个数字");
        Scanner input= new Scanner(System.in);
        double a=input.nextDouble();
        if (a>0){
            System.out.println("正数");
        }else if (a==0){
            System.out.println("不是正数也不是负数");
        }
        else{
            System.out.println("负数");
        }
    }
}
