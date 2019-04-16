package hch.lone.wolf.thread;

/**
 * @description: join合并线程，线程阻塞
 * @author: hch
 * @create: 2019/4/14 22:19
 * @version: v1.0
 */
public class JoinDemo extends Thread {

    public static void main(String[] args) throws InterruptedException {
        JoinDemo demo = new JoinDemo();
        Thread thread = new Thread(demo);
        thread.start();
        for (int i = 0; i < 100; i++) {
            if (50 == i) {
                thread.join();
            }
            System.out.println("main--》" + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("join-->" + i);
        }
    }
}
