package homew_2021_3_5;

public class Book {
    private int pageNum;
    private String title;
    public void setPageNum(int pageNum){
        if(pageNum<200){
            System.out.println("页数有误");
            pageNum=200;
        this.pageNum=pageNum;}
    }
    public int getPageNum(){
        return pageNum;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void detail(int pageNum,String title){
        this.title=title;
        System.out.println("教材名称："+this.title);
        setPageNum(pageNum);
        System.out.println("页数："+this.pageNum);
    }
}
