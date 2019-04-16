package hch.lone.wolf.thread;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/12 20:43
 */
public class WaitDemo implements Runnable {
    private static Object obj = new Object();
    private static Object waitObj = new Object();

    @Override
    public void run() {
        //持有资源
        synchronized (waitObj) {
            System.out.println(Thread.currentThread().getName() + "占用资源");
            try {
                waitObj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "释放了资源");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new WaitDemo(), "线程1");
        thread.start();

        Thread thread2 = new Thread(new WaitDemo(), "线程2");
        thread2.start();
        Thread.sleep(3000L);
        synchronized (waitObj){
            waitObj.notify();
        }
    }
}
