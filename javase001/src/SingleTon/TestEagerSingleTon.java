package SingleTon;

public class TestEagerSingleTon {
    public static void main(String[] args) {
        //        EagerSingleTon e1 = new EagerSingleTon();
//        EagerSingleTon e2 = new EagerSingleTon();
//        System.out.println(e1==e2);//true
        EagerSingleTon e1 = EagerSingleTon.getInstance();
        EagerSingleTon e2 = EagerSingleTon.getInstance();
        System.out.println(e1==e2);
    }

}
