package hch.lone.wolf.interview;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/19 21:46
 */
public class ThreadT1T2 {
    public static void main(String[] args) throws InterruptedException {
        final Object obj = new Object();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        obj.wait();
                        System.out.println("Thread t1 run");
                    } catch (InterruptedException e) {

                    }
                }
            }
        };
        t1.start();
        System.out.println("start thread t1");
        Thread.sleep(500);
        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    obj.notify();
                    System.out.println("Thread t2 run");
                }
            }
        };
        t2.start();
        System.out.println("start thread t2");
        Thread.sleep(1000);
    }
}
