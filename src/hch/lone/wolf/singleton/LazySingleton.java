package hch.lone.wolf.singleton;

/**
 * @Description 懒汉式单例
 * @CreateBy hechunhui
 * @created 2018/9/19$ 23:15$
 */
public class LazySingleton {
    private LazySingleton(){
        System.out.println("LazySingleton is create");
    }
    private static LazySingleton instance = null;

    /**
     * 防止在多线程时线程1赋值完成之前线程2可能判断为null的情况
     * 因为加了同步，因此性能较差
     * @return
     */
    public static synchronized LazySingleton getInstance(){
        if (null==instance){
            instance = new LazySingleton();
        }
        return instance;
    }
}
