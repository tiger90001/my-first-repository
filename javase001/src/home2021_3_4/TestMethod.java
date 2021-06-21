package home2021_3_4;

public class TestMethod {
    //创建两个无参数，无返回值的方法
    public static void method1(){
        System.out.println("method1");
    }
    public static void method2(){
        System.out.println("method2");
    }
    //创建两个无参数，有返回值的方法
    public static int method3(){
        return 3;
    }
    public static int method4(){
        return 4;
    }
    //创建两个有参数，无返回值的方法
    public static void method5(int a){
        System.out.println(a);
    }
    public static void method6(String a){
        System.out.println(a);
    }
    //创建两个有参数，有返回值的方法
    public static int method7(int a,int b){
        return a+b;
    }
    public static int method8(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        method1();method2();
        System.out.println(method3()+method4());
        method5(5);method6("6");
        System.out.println(method7(3,4));
        System.out.println(method8(2,4));
    }
}
