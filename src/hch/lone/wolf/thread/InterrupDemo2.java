package hch.lone.wolf.thread;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/12 22:28
 */
public class InterrupDemo2 implements Runnable{


    @Override
    public void run() {
        //判断线程是否结束
        while (!Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new InterrupDemo2());
        thread.start();
        Thread.sleep(1000L);
        thread.interrupt();
    }
}
