package SingleTon;
//饿汉模式

public class EagerSingleTon {


    //构造函数私有化！---- 1.先从源头扼制其他类不能随意创建对象
    private EagerSingleTon() {
    }

    //类体中创建
    private final static EagerSingleTon e = new EagerSingleTon();

    //2.提供一个EagerSingleTon的对象给其他类使用！
    public static EagerSingleTon getInstance() {
        return e;
    }


}

