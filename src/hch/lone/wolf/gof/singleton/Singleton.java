package hch.lone.wolf.gof.singleton;

/**
 * @ClassName Singleton
 * @Description 单例模式
 * @CreateBy hch
 * @Created 2018/9/19 22:59
 *
 */
public class Singleton {
    private Singleton(){
        System.out.println("创建单例。。。");

    }
    private static  Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
    //问题：如果单例类还扮演其他角色，那么在使用单例类时便会初始化
    public static void createString(){
        System.out.println("createString in Singleton");
    }
}
