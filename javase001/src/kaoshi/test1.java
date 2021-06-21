package kaoshi;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
//        1.根据考试成绩输出对应的礼物，
//        90分以上爸爸给买电脑，
//        80分以上爸爸给买手机，
//        60分以上爸爸请吃一顿大餐，
//        60分以下爸爸给买学习资料。
//        要求：该题使用多重if完成
        Scanner Sc=new Scanner(System.in);
        System.out.println("系统：请输入分数");
        double score=Sc.nextDouble();
        if (score>90){
            System.out.println("爸爸给买电脑");
        }else if(score>80){
            System.out.println("爸爸给买手机");
        }
        else if(score>60){
            System.out.println("爸爸请吃大餐");
        }else {
            System.out.println("爸爸给买学习资料");
        }
    }
}
