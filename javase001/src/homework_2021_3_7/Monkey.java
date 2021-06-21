package homework_2021_3_7;

public class Monkey {
    private String name;
    private String sex;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    private void speak(){
        System.out.println("说猴语");
    }
}