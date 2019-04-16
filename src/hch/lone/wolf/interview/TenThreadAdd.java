package hch.lone.wolf.interview;

/**
 * @Description 写10个线程从1累加到100
 * @Author hechunhui
 * @Created 2018/12/19 22:20
 */
public class TenThreadAdd extends Thread{
    static int num = 0;
    public synchronized static void inCreate(){
        num = num+1;
    }


    public static void main(String[] args) throws InterruptedException {
        int sum = 0;
        for (int i = 1;i<=10;i++){
            sum +=i;

        }
        System.out.println("1加到10= "+sum);

        for (int i=1;i<=10;i++){
            new TenThreadAdd(){
                @Override
                public void run() {
                    inCreate();
                }
            }.start();
            Thread.sleep(10L);
        }
        System.out.println(num);
    }
}
