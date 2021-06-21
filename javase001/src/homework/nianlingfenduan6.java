package homework;

import java.util.Scanner;

public class nianlingfenduan6 {
    public static void main(String[] args) {
        System.out.println("请输入年龄");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>69){System.out.println("老年");}
        else if(a>=46){System.out.println("中年");}
        else if(a>=18){System.out.println("青年");}
        else if(a>=13){System.out.println("青少年");}
        else if(a>=7){System.out.println("少儿");}
        else if(a>0){System.out.println("婴幼儿");}
        else{System.out.println("请输入正确的年龄");}

    }
}
