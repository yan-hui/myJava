package hch.lone.wolf.lock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;

/**
 * @Description 模拟线程不安全
 * @Author hechunhui
 * @Created 2018/12/12 17:13
 */
public class UnSafeThread2 {
    private static int num=0;
    private static  CountDownLatch countDownLatch = new CountDownLatch(10);
    private static Lock lock = new MyLock();
    /**
     * 每次都进行num++操作
     *
     */
    public static void inCreate(){
        lock.lock();
        try {
            num++;
        }finally {

            lock.unlock();
        }
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            new Thread(()->{
                for (int j=0;j<100;j++){
                    inCreate();
                    try {
                        Thread.sleep(1L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //每个线程执行完成之后，调用countDownLatch
                countDownLatch.countDown();
            }).start();

        }

        while (true){
            if (countDownLatch.getCount()==0){
                System.out.println(num);
                break;
            }
        }
    }
}
