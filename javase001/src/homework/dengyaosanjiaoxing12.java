package homework;

public class dengyaosanjiaoxing12 {
    public static void main(String[] args){
        int size=5;
        for(int i=0;i<size;i++){

            for(int j=0;j<size-1-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
