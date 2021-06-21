package homew_2021_3_5;

public class TestHusband {
    public static void main(String[] args) {
        Husband tiger = new Husband("123456" , "tiger" , "1994.2.20");
        Wife fangwinxi = new Wife("22222" , "fangwinxi" , "1993.12.11");
        tiger.w = fangwinxi;
        fangwinxi.h = tiger;
        System.out.println(tiger.name + "的妻子是" + tiger.w.name);
        System.out.println(fangwinxi.name + "丈夫是" + fangwinxi.h.name);
        tiger.w = null;
        fangwinxi.h = null;
        System.out.println(tiger.name + "的妻子是" + tiger.w.name);
        System.out.println(fangwinxi.name + "丈夫是" + fangwinxi.h.name);
    }
}
