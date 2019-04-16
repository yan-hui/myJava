package hch.lone.wolf.synopsis;

import java.util.concurrent.CountDownLatch;

/**
 * @Description 模拟线程不安全
 * @Author hechunhui
 * @Created 2018/12/12 17:13
 */
public class UnSafeThread {
    private static int num=0;
    private static  CountDownLatch countDownLatch = new CountDownLatch(10);

    /**
     * 每次都进行num++操作
     *
     */
    public /*synchronized*/  static void inCreate(){
        num++;
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            new Thread(()->{
                for (int j=0;j<100;j++){
                    inCreate();
                    try {
                        Thread.sleep(10L);
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
