package hch.lone.wolf.proxy;

import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

import java.lang.reflect.Method;

/**
 * @Description javassist实现动态代理
 * @CreateBy hechunhui
 * @created 2018/10/9$ 20:53$
 */
public class JavassistDynDbQueryHandler implements MethodHandler {
    private DBQuery query = null;
    @Override
    public Object invoke(Object o, Method method, Method method1, Object[] objects) throws Throwable {
       if (null ==query){
           query = new DBQuery();
       }
        return query.request();
    }
    public static IDBQuery createJavassistDynProxy() throws IllegalAccessException, InstantiationException {
        ProxyFactory proxyFactory = new ProxyFactory();
        //指定接口
        proxyFactory.setInterfaces(new Class[]{IDBQuery.class});
        Class proxyClass = proxyFactory.createClass();
        IDBQuery javassistProxy=(IDBQuery) proxyClass.newInstance();
        //设置handler处理器
        ((ProxyObject)javassistProxy).setHandler(new JavassistDynDbQueryHandler());
        return javassistProxy;
    }

}
