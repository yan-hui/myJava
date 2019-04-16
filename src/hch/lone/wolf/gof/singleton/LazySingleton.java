package hch.lone.wolf.gof.singleton;

import java.io.ObjectStreamException;

/**
 * @Description 懒汉式单例
 * @CreateBy hechunhui
 * @created 2018/9/19$ 23:15$
 */
public class LazySingleton {
    private LazySingleton(){
        System.out.println("LazySingleton is create");
        if (instance!=null){//防止反射破解单例
            throw new RuntimeException();
        }
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

    /**
     * 反序列化时，如果定义了readResolve()则直接返回此方法指定的对象，而不需要单独再创建新的对象
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
