package practice_2021_3_11;

import java.util.Scanner;

public class Rabbit {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月数");
        int j=sc.nextInt();
        for(int i=1;i<=j;i++){
     System.out.println("第"+i+"个月的兔子数目为："+Rabbit.count(i));
    }
}
        public static int count(int n){
            if(n==1||n==2)
                return 1;
            else
            return count(n-1)+count(n-2);
        }
}

