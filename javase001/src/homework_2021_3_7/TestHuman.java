package homework_2021_3_7;

public class TestHuman {
    public static void main(String[] args) {
        Human H1= new Human();
        H1.setName("张三");
        H1.setSex("男");
        System.out.println(H1.getName());
        System.out.println(H1.getSex());
        H1.speak();
    }

}
