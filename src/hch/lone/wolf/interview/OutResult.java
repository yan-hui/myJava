package hch.lone.wolf.interview;

/**
 * @Description 写出每个输出的值
 * @Author hechunhui
 * @Created 2018/12/21 16:21
 */
public class OutResult {
    private static int x  =0;
    private int size;

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        OutResult.x = x;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        OutResult result1 = new OutResult();
        result1.x++;
        OutResult result2 = new OutResult();
        result2.x++;
        OutResult.x++;
        System.out.println(x);
        System.out.println(result1.getSize());
    }
}
