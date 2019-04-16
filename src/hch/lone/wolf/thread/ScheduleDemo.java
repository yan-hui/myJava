package hch.lone.wolf.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @description:
 * @author: hch
 * @create: 2019/4/15 12:55
 * @version: v1.0
 */
public class ScheduleDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(System.currentTimeMillis()+"执行了一次");
            }
        },new Date(System.currentTimeMillis()+1000),200);
    }
}
