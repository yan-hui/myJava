package hch.lone.wolf.thread;

/**
 * @Description 线程中断
 * @Author hechunhui
 * @Created 2018/12/12 22:22
 */
public class InterrupDemo implements Runnable {
    private static volatile boolean FLAG = true;

    @Override
    public void run() {
        while (FLAG) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new InterrupDemo());
        thread.start();
        Thread.sleep(1000L);
        FLAG = false;
    }
}
