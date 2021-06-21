package SingleTon;

public class LazySingleTon {
    //1.源头扼制
    private LazySingleTon(){}

    private  static   LazySingleTon e;//null

    //2.提供对象的方法
    public static LazySingleTon getInstance(){
        //一个if语句阻挡不了多线程的！
        //如何只有一个对象
        if(e==null){
            e=new LazySingleTon();
        }
        return e;
    }
}
