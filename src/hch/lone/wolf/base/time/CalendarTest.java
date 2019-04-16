package hch.lone.wolf.base.time;


import org.junit.Test;

import java.util.Calendar;

/**
 * @Description Calendar类测试
 * @Author hechunhui
 * @CreatedBy 2018/10/18 15:39
 */
public class CalendarTest {
    @Test
    public void methodTest(){
        Calendar calendar = Calendar.getInstance();
       //calendar.set(2017,9-1,1);
       //calendar.set(Calendar.DATE,10);
       //calendar.set(Calendar.YEAR,2017);
        System.out.println("年： "+calendar.get(Calendar.YEAR));
        //月份从0开始，需要+1
        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.println("月： "+month);
        System.out.println("日： "+calendar.get(Calendar.DATE));
        System.out.println("日： "+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("时-24： "+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("时-12： "+calendar.get(Calendar.HOUR));
        System.out.println("分： "+calendar.get(Calendar.MINUTE));
        System.out.println("秒： "+calendar.get(Calendar.SECOND));
        //1--星期天，2--星期一，3--星期二
        System.out.println("星期： "+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("本月的第几周： "+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("本月的第几天： "+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("今年的第几天： "+calendar.get(Calendar.DAY_OF_YEAR));


    }

}
