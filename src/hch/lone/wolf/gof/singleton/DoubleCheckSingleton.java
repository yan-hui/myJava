package hch.lone.wolf.gof.singleton;

/**
 * @Description 双重检测锁
 * @Author hechunhui
 * @Created 2018/12/12 22:13
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == instance) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
