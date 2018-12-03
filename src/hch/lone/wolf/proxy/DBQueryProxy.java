package hch.lone.wolf.proxy;

/**
 * @Description 代理模式   实现延迟加载，可提升系统启动速度
 * @CreateBy hechunhui
 * @created 2018/10/9$ 20:18$
 */
public class DBQueryProxy implements IDBQuery{
   private DBQuery query = null;
    @Override
    public String request() {
        //在真正需要的时候才创建真实对象
        if (null ==query){
            query = new DBQuery();
        }
        return query.request();
    }
}
