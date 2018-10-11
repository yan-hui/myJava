package hch.lone.wolf.gof.singleton;

/**
 * @Description 内部类单例,懒加载，线程友好
 * @CreateBy hechunhui
 * @created 2018/9/19$ 23:22$
 */
public class StaticSingleton {
    private StaticSingleton(){
        System.out.println("StaticSingleton is create");
    }
    private static class SingletonHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }
    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
