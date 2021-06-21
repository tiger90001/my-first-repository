package home2021_3_4;

public class TestBankAccount {
    public static void main(String[] args) {
        bankAccount b1=new bankAccount();
        b1.account=123456789;
        b1.passWord=123456;
        b1.balance=9.9;
        System.out.println("您的银行账户为"+b1.account);
        System.out.println("您的银行密码为"+b1.passWord);
        System.out.println("您的余额为"+b1.balance+"元");
    }
}
