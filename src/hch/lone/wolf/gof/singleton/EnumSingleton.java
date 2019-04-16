package hch.lone.wolf.gof.singleton;

/**
 * @Description
 * @Author hechunhui 枚举单例，天然线程安全，没有懒加载和同步，调用效率高
 * @Created 2018/12/26 17:11
 */
public enum  EnumSingleton {
    INSTANCE;

    /**
     * 单例模式的额外操作
     */
    public void SingletonOperation(){

    }
}
