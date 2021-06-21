package practice_2021_3_11;



public class Cola {
    public static void main(String[] args) {
//        1.给20块钱买可乐，每瓶可乐3块钱，喝完之后退瓶子可以换回1块钱，问最多可以喝到多少瓶可乐。
        int count=0;
        for(int money=20;money>3;money=(money/3+money%3)){
            count+=(money/3);
        }
        System.out.println("可以喝"+count+"瓶可乐");

    }
}
