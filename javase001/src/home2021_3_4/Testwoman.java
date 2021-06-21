package home2021_3_4;

public class Testwoman {
    public static void main(String[] args) {
        woman m1=new woman();
        m1.IDNumber=1234567891;
        m1.name="有名";
        m1.sex='女';
        m1.nameOfMan="有姓";
        System.out.println("身份证号："+m1.IDNumber);
        System.out.println("姓名："+m1.name);
        System.out.println("性别："+m1.sex);
        System.out.println("男人名字："+m1.nameOfMan);

    }
}
