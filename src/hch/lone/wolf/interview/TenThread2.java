package hch.lone.wolf.interview;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/19 22:48
 */
public class TenThread2 extends Thread {
    private int stratNum;
    public static int sum;

    public TenThread2(int startNum) {
        this.stratNum = startNum;
    }

    public static synchronized void add(int num) {
        sum += num;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + stratNum + i;
        }
        add(sum);
    }

    public static void main(String[] args) throws Exception {
        Thread[] threadList = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadList[i] = new TenThread2(10 * i + 1);
            threadList[i].start();
        }
        for (int i = 0; i < 10; i++) {
            threadList[i].join();
        }
        System.out.println("Sum is : " + sum);
    }

}
