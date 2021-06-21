package practice_2021_3_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BetweenDate {
    public int betweenDays(Date startDate, Date endDate){
       int betweenDate = (int) ((endDate.getTime() - startDate.getTime())/(60*60*24*1000));
       return betweenDate;
    }
    public static void main(String[] args) throws ParseException {
     //设置转换的日期格式
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

     //开始时间
        Date startDate = sdf.parse("1899-12-25");
    //结束时间
        Date endDate = sdf.parse("1900-01-01");

     //得到相差的天数 betweenDate
        int betweenDate = (int) ((endDate.getTime() - startDate.getTime())/(60*60*24*1000));

     //打印控制台相差的天数
        System.out.println(betweenDate);


    }

}
