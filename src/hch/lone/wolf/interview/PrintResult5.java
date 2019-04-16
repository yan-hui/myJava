package hch.lone.wolf.interview;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/25 16:55
 */
public class PrintResult5 {
    public static void main(String[] args) {
        B5 b= new C5();
        b.func1();
        b.func2();
    }


}
class A5{
    void func1(){
        System.out.print("A");
    }

}
class B5 extends A5{
    void func2(){
        System.out.print("B");
    }
}
class C5 extends B5{
    void func2() {
        System.out.print("C");
    }
}
