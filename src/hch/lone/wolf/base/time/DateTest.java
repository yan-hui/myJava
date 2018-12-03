package hch.lone.wolf.base.time;


import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description Date类型测试
 * @Author hechunhui
 * @CreatedBy 2018/10/18 15:01
 */
public class DateTest {
    @Test
    public void dateMethod() throws ParseException {
        Date date = new Date();
        System.out.println();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse("2018-10-20");
        //在指定日期之后或之前
        System.out.println("after: "+date.after(parse));
        System.out.println("before: "+date.before(parse));
        //相等返回0，date在parse前返回负数，在parse后返回正数
        System.out.println("compareTo: "+date.compareTo(parse));
        Date parse2 = dateFormat.parse("2018-10-20");
        System.out.println("equals: "+parse.equals(parse2));
        //获取毫秒数
        System.out.println(date.getTime());
        System.out.println(date.toString());
    }
}
