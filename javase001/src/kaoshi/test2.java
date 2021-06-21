package kaoshi;



import java.util.Scanner;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
       /** 2.要求用户输入一个1到3之间的整数， 
        1表示石头，2表示剪刀，3表示布
        系统也会自动随机出一个“石头”“剪刀”或者“布”
        然后，系统告诉你输赢！*/
       System.out.println("系统提示：请输入1或2或3，分别表示石头、剪刀、布");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Random rd = new Random();
        int x = rd.nextInt(3)+1;
        String a1="",x1="";
        if(a==1){a1="石头";}
        if(a==2){a1="剪刀";}
        if(a==3){a1="布";}
        if(x==1){x1="石头";}
        if(x==2){x1="剪刀";}
        if(x==3){x1="布";}
       System.out.println("系统提示：您出的是"+a1+"!系统出的是"+x1+"!");
        if((a==1&x==2)|(a==2&x==3)|(a==3&x==1)){
            System.out.println("您赢了！");
        }else if((a==1&x==1)|(a==2&x==2)|(a==3&x==3)){
            System.out.println("您和系统是平局！");
        }else{System.out.println("您输了！");}

    }
}
