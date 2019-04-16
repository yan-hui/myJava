package hch.lone.wolf.interview;

/**
 * @Description 实现一个多线程，其中一个对静态全局进行100次自加，另一个对该变量进行100次自减，要求
 * 这两个线程的实现方式不同
 * 线程同步
 * @Author hechunhui
 * @Created 2018/12/25 17:18
 */
public class ThreadTest2 {
    private static volatile  int num = 100;

    public static void main(String[] args) {
        ThreadTest2 test1 = new ThreadTest2();
        TT22 tt = test1.new TT22();
        tt.start();
        Thread tt2 = new Thread(test1.new TT222());
        tt2.start();
    }

    class TT22 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                synchronized (TT22.class) {
                    num++;
                }
                System.out.println("Thread TT22 : " + num);
            }
        }
    }

    class TT222 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                synchronized (TT222.class) {
                    num--;
                    System.out.println("Thread TT222 : " + num);
                }
            }
        }
    }

}
