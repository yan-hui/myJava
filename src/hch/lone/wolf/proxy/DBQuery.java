package hch.lone.wolf.proxy;

/**
 * @Description
 * @CreateBy hechunhui
 * @created 2018/10/9$ 20:16$
 */
public class DBQuery implements IDBQuery{
    public DBQuery() {
        try {
            //可能包含数据库连接等耗时操作
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String request() {
        return "request String";
    }
}
