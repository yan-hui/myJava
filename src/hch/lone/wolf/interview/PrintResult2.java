package hch.lone.wolf.interview;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/25 16:46
 */
public class PrintResult2 {
    public static void main(String[] args) {
        B2 b2 = new B2();
    }
}
class A2{
    static {
        System.out.print("X");
    }
    public A2(){
        System.out.print("A");
    }
}
class B2 extends A2{
    static {
        System.out.print("Y");
    }
    public B2(){
        System.out.print("B");
    }
}