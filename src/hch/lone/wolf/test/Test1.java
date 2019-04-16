package hch.lone.wolf.test;

/**
 * @description:
 * @author: hch
 * @create: 2019/3/22 14:28
 * @version: v1.0
 */
public class Test1 {

    public void go(){
        String s = String.format("%, d", 10000000);
        System.out.println(s);
    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.go();
    }
}
