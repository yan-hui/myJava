package hch.lone.wolf.singleton;

/**
 * @Description 防止序列化和反序列化生成新的实例
 * @CreateBy hechunhui
 * @created 2018/9/19$ 23:26$
 */
public class SerSingleton {
    private SerSingleton(){
        System.out.println("SerSingleton is create");
    }
    private  static SerSingleton instance = new SerSingleton();
    public static SerSingleton getInstance(){
        return instance;
    }
    //阻止生成心的实例，总是返回当前对象
    private Object readResolve(){
        return instance;
    }
}
