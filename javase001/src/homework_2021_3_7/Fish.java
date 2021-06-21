package homework_2021_3_7;

public class Fish extends Animal {
private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void swing(){
    System.out.println("游动方法");
}
}
