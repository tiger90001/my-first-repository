package practice_2021_3_11;

import java.util.Scanner;

public class time {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份：");
        int year = sc.nextInt();
        System.out.println("输入月份：");
        int month = sc.nextInt();
        System.out.println("输入日期：");
        int days = sc.nextInt();

        /*1，年：（闰年能将4整除，不能将100整除）
                1.1，按平年算，每年365天
                1.2，每个闰年加1天，若输入的那年是闰年，2月后，要加1天，反之不用*/
        int yDays = (year -1900)*365;

        int rDays = 0;//每个润年加1
        for (int i = 1900; i <=year ; i++) {
            if (i%4==0 && i%100!=0){//判断是否为闰年
                rDays++;//只要是闰年就加1
                if (month<3){//若输入的年份为润年，判断其是否过了2月，没过减1
                    rDays = rDays-1;
                }
            }
        }
        /*2，月：
                按照平年每个月的天数：31,28,31,30,31,30,31,31,30,31,30,31*/
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        int mDays = 0;
        if (month == 1){
            mDays = 0;
        }else{
            for (int i = 0; i <month-1 ; i++){//减1，因为当月没过，按下面的日期来算
                mDays += months[i];//累加当月之前的天数
            }

        }
        /*4，日期：
                天数直接相加*/

        int sum = yDays + rDays + mDays +days;

        System.out.println("您输入的月份为："+sum);

    }
}

