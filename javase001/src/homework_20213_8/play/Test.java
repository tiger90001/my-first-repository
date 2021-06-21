package homework_20213_8.play;

public class Test {
    public static void main(String[] args) {
        Instrument I1=new Erhu();
        Instrument I2=new Piano();
        Instrument I3=new Violin();
        Musician M =new Musician();
        M.play(I1);
        M.play(I2);
        M.play(I3);
    }
}
