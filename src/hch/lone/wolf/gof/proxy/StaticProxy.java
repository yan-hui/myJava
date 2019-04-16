package hch.lone.wolf.gof.proxy;

/**
 * @description: 1、真实角色
 * 2、代理角色
 * 3、二者需实现共同的接口
 * @author: hch
 * @create: 2019/4/14 20:17
 * @version: v1.0
 */
public class StaticProxy {
    public static void main(String[] args) {
        Marry you = new You();
        Marry marryCompany = new WeddingConpany(you);
        marryCompany.marrry();

    }


}

interface Marry {
    void marrry();
}

class You implements Marry {
    @Override
    public void marrry() {
        System.out.println("你结婚......");
    }
}

class WeddingConpany implements Marry {
    private Marry you;

    public WeddingConpany(Marry you) {
        this.you = you;
    }

    @Override
    public void marrry() {
        before();
        you.marrry();
        after();
    }

    private void before() {
        System.out.println("布置场地，车队。。。。。");
    }

    private void after() {
        System.out.println("婚礼活动。。。。。。");
    }
}