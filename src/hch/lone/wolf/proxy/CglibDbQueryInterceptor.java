package hch.lone.wolf.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description Cglib动态代理
 * @CreateBy hechunhui
 * @created 2018/10/9$ 20:38$
 */
public class CglibDbQueryInterceptor implements MethodInterceptor {
    private DBQuery query = null;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (null == query) {
            query = new DBQuery();
        }
        return query.request();
    }

    public static IDBQuery createCglibProxy(){
        Enhancer enhancer = new Enhancer();
        //指定切入器，定义代理类逻辑
        enhancer.setCallback(new CglibDbQueryInterceptor());
        //指定实现的接口
        enhancer.setInterfaces(new Class[]{IDBQuery.class});
        //生产代理类的实例
        IDBQuery chlibProxy = (IDBQuery) enhancer.create();
        return  chlibProxy;
    }

}
