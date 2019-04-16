package hch.lone.wolf.interview;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/19 22:57
 */
public class ThreadTest extends Thread {
    private  int num;
    public static int sum = 0;

    public static synchronized void inCreate(int num) {
        sum = sum + num;
    }

    public ThreadTest(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        inCreate(num);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new ThreadTest(i+1);
            threads[i].start();
        }
        for (int i = 0; i < 10; i++) {
            threads[i].join();
        }
        System.out.println("sum = " + sum);
    }
}
