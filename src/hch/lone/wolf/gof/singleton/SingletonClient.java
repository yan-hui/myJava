package hch.lone.wolf.gof.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @Description
 * 测试结果：
 *        LazySingleton: 421
 *        HungrySingleton: 82
 *        DoubleCheckSingleton: 89
 *        StaticSingleton: 102
 *        EnumSingleton: 97
 * 占用资源少，不需要延迟加载：枚举式 好于 饿汉式
 * 占用资源大，需要延迟加载：静态内部类式 好于 懒汉式，个人感觉双重检查好点
 * @CreateBy hechunhui
 * @created 2018/9/19$ 23:06$
 */
public class SingletonClient {
    public static void main(String[] args) throws Exception {
        /*long time = System.currentTimeMillis();
        System.out.println();
        HungrySingleton.getInstance();
        //Singleton.createString();
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time);
        LazySingleton.getInstance();
        long time3 = System.currentTimeMillis();
        System.out.println(time3 - time2);
        StaticSingleton.getInstance();
        long time4 = System.currentTimeMillis();
        System.out.println(time4 - time3);*/

        int threadNum = 10;
       final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        long start  = System.currentTimeMillis();
        for (int i=0;i<10;i++){
            new Thread(()->{
                for (int j=0;j<1000000;j++){
                   //Object obj = LazySingleton.getInstance();
                   //Object obj = HungrySingleton.getInstance();
                   //Object obj = DoubleCheckSingleton.getInstance();
                   //Object obj = StaticSingleton.getInstance();
                   Object obj = EnumSingleton.INSTANCE;
                }
                countDownLatch.countDown();
            }).start();
        }
        //main线程阻塞，直到技术器变为0，才会继续往下执行
        countDownLatch.await();
        long end  = System.currentTimeMillis();
        System.out.println("总耗时： "+(end-start));
    }
}
