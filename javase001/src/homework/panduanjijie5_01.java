package homework;

import java.util.Scanner;

public class panduanjijie5_01 {
    public static void main(String[] args) {
        //3,4,5 春季
        //	6,7,8 夏季
        //	9,10,11 秋季panduanjijie5_01
        //	12, 1, 2 冬季
        System.out.println("请输入月份");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==3|a==4|a==5){System.out.println("春季");}
        else if(a==6|a==7|a==8){System.out.println("夏季");}
        else if(a==9|a==10|a==11){System.out.println("秋季");}
        else if(a==12|a==1|a==2){System.out.println("冬季");}
        else{System.out.println("请输入正确的月份");}
    }
}
