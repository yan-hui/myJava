package hch.lone.wolf.proxy;

/**
 * @Description 代理模式测试
 * @CreateBy hechunhui
 * @created 2018/10/9$ 20:21$
 */
public class ProxyClient {
    public static void main(String[] args) {
        //使用代理
        IDBQuery query = new DBQueryProxy();
        //真正使用时才创建对象
        query.request();
    }
}
