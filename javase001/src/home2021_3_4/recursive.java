package home2021_3_4;

public class recursive {
    //求1-5的阶乘之和
    static int a=1,b=1,c;
    public static void factorial(){
        if(a<6){
            b=b*a;
            a++;
            c+=b;
            factorial();
        }
    }
    public static void main(String[] args) {
        factorial();
        System.out.println(c);
    }

}
