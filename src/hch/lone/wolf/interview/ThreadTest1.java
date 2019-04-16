package hch.lone.wolf.interview;

/**
 * @Description 实现一个多线程，其中一个对静态全局进行100次自加，另一个对该变量进行100次自减，要求
 * 这两个线程的实现方式不同
 * @Author hechunhui
 * @Created 2018/12/25 17:18
 */
public class ThreadTest1 {
    private static int num = 100;

    public static void main(String[] args) {
        ThreadTest1 test1 = new ThreadTest1();
        TT tt = test1.new TT();
        tt.start();
        Thread tt2 = new Thread(test1.new TT2());
        tt2.start();
    }

    class TT extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                num++;
            }
            System.out.println("Thread TT : " + num);
        }
    }

    class TT2 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                num--;
                System.out.println("Thread TT2 : " + num);
            }
        }
    }


}
