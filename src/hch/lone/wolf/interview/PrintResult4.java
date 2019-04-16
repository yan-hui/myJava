package hch.lone.wolf.interview;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/25 16:55
 */
public class PrintResult4 {
    public static void main(String[] args) {
        System.out.println(func(10,0));
    }

    static int func(int i, int j) {
        try {
            return i / j;
        } catch (ArithmeticException e) {
            System.out.print("A");
            return 0;
        } catch (Exception e) {
            System.out.print("B");
            return 0;
        } finally {
            System.out.print("C");
        }
    }
}
