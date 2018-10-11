package hch.lone.wolf.gof.singleton;

/**
 * @Description
 * @CreateBy hechunhui
 * @created 2018/9/19$ 23:06$
 */
public class SingletonClient {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println();
        Singleton.getInstance();
        //Singleton.createString();
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time);
        LazySingleton.getInstance();
        long time3 = System.currentTimeMillis();
        System.out.println(time3 - time2);
        StaticSingleton.getInstance();
        long time4 = System.currentTimeMillis();
        System.out.println(time4 - time3);

    }
}
