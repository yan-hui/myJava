package hch.lone.wolf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description 使用JDK的动态代理
 * @CreateBy hechunhui
 * @created 2018/10/9$ 20:33$
 */
public class JdkDbQueryHandler implements InvocationHandler {
    private DBQuery query = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (null == query) {
            query = new DBQuery();
        }
        return query.request();
    }

    public static IDBQuery createJdkProxy() {
        IDBQuery jdbProxy = (IDBQuery) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{IDBQuery.class},
                new JdkDbQueryHandler());
        return jdbProxy;
    }
}
