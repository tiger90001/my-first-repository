package SingleTon;

public class TestLazySingTon {
    public static void main(String[] args) {
        LazySingleTon e1 = LazySingleTon.getInstance();
        LazySingleTon e2 = LazySingleTon.getInstance();
        System.out.println(e1==e2);//true
    }
}
