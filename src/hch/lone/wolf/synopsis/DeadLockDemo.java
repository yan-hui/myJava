package hch.lone.wolf.synopsis;

/**
 * @Description 模拟死锁
 * @Author hechunhui
 * @Created 2018/12/12 16:46
 */
public class DeadLockDemo {
    private static final Object HEAD_A = new Object();
    private static final Object HEAD_B = new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (HEAD_A){
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (HEAD_B){
                    System.out.println("A成功揪到了B的头发");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (HEAD_B){
                synchronized (HEAD_A){
                    System.out.println("B成功揪到了A的头发");
                }
            }
        }).start();
    }
}
