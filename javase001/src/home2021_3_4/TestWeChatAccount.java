package home2021_3_4;

public class TestWeChatAccount {
    public static void main(String[] args) {
        WeChatAccount W1=new WeChatAccount();
        W1.wechatNumber="zytiger90001";
        W1.nickname="无聊的人";
        W1.phoneNumber=987654321;
        System.out.println("您的微信号是:"+W1.wechatNumber);
        System.out.println("您的微信昵称是:"+W1.nickname);
        System.out.println("您的手机号是："+W1.phoneNumber);
    }

}
