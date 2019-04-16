package hch.lone.wolf.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 使用sleep模拟倒计时、计数器
 * @author: hch
 * @create: 2019/4/14 22:34
 * @version: v1.0
 */
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        Date endTime = new Date(System.currentTimeMillis());
        long end = endTime.getTime();

        while (true){
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            endTime = new Date(endTime.getTime()-1000);
            Thread.sleep(1000);

            if (end-5000>endTime.getTime()){
                break;
            }
        }

        int num=10;
        while (true){
            System.out.println(num--);
            Thread.sleep(1000);
            if (num<=0){
                break;
            }
        }

    }
}
