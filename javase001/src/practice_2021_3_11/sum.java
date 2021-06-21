package practice_2021_3_11;

import java.util.Scanner;

public class sum {
    //    3.循环输入大于0的数字进行累加，直到输入的数字为0，就结束循环，并最后输出累加的结果。
    public static void main(String[] args) {
        double sum=0.0;
    while (true){
        System.out.println("请输入一个数字");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        if(a==0){
            break;
        }
        sum+=a;
    }
    System.out.println("您输入的所有数字之和为："+sum);
    }
}
