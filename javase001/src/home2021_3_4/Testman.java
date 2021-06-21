package home2021_3_4;

public class Testman {
    public static void main(String[] args) {
        man m1=new man();
        m1.IDNumber=1234567891;
        m1.name="无名";
        m1.sex='男';
        m1.nameOfWomen="无姓";
        System.out.println("身份证号："+m1.IDNumber);
        System.out.println("姓名："+m1.name);
        System.out.println("性别："+m1.sex);
        System.out.println("女人名字："+m1.nameOfWomen);

    }
}
