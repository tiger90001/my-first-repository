package homework;

import java.util.Scanner;

public class panduanjijie5_02 {
    public static void main(String[] args) {
        //3,4,5 春季
        //	6,7,8 夏季
        //	9,10,11 秋季panduanjijie5_01
        //	12, 1, 2 冬季

        System.out.println("请输入月份");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a){
            case 12: case 1: case 2:
                System.out.println("冬季");
                break;
            case 3: case 4: case 5:
                System.out.println("春季");
                break;
            case 6: case 7: case 8:
                System.out.println("夏季");
                break;
            case 9: case 10: case 11:
                System.out.println("秋季");
                break;
            default:System.out.println("请输入正确的月份");
        }
    }

}
