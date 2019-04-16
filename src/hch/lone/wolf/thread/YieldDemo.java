package hch.lone.wolf.thread;

/**
 * @description: join合并线程，线程阻塞
 * @author: hch
 * @create: 2019/4/14 22:19
 * @version: v1.0
 */
public class YieldDemo extends Thread {

    public static void main(String[] args) throws InterruptedException {
        YieldDemo demo = new YieldDemo();
        Thread thread = new Thread(demo);
        thread.start();
        for (int i = 0; i < 100; i++) {
            if (i%2==0) {
                //暂停本线程main
                Thread.yield();
            }
            System.out.println("main--》" + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("yeid-->" + i);
        }
    }
}
