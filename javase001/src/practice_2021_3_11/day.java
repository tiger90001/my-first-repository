package practice_2021_3_11;

public class day {
//    2.计算2000年1月1日到2008年1月1日相距多少天。（注意闰年）
public static void main(String[] args) {
    int y1=2000,y2=2008;
    int day=((y2-y2)/4+1)*366+((y2-y1)-(y2-y2)/4)*365;
    System.out.println("2000年1月1日到2008年1月1日相距"+day+"天");
}
}
