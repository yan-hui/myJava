package hch.lone.wolf.interview;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/25 16:50
 */
public class PrintResult3 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.print();
    }

}
class Base{
    public String s="X";
    public void print(){
        System.out.print(s);
        printAgain();
    }

    public  void printAgain() {
        System.out.println("A");
    }
}
class Sub extends Base{
    public String s="Y";
    public void printAgain(){
        System.out.println("B");
    }

}
