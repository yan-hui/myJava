package hch.lone.wolf.gof.singleton;

/**
 * @ClassName Singleton
 * @Description 饿汉式单例模式
 * @CreateBy hch
 * @Created 2018/9/19 22:59
 */
public class HungrySingleton {
    private HungrySingleton() {
        System.out.println("创建单例。。。");

    }

    //类初始化时，立即加载此对象，加载类时，天然的是线程安全的
    private static HungrySingleton instance = new HungrySingleton();

    /**
     * 方法未同步，调用效率高
     *
     * @return
     */
    public static HungrySingleton getInstance() {
        return instance;
    }

    //问题：如果单例类还扮演其他角色，那么在使用单例类时便会初始化
    public static void createString() {
        System.out.println("createString in Singleton");
    }
}
