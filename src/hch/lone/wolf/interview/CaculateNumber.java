package hch.lone.wolf.interview;

/**
 * @description: 输入2, 5，计算2+22+222+2222+22222;
 * @author: hch
 * @create: 2019/3/12 20:24
 * @version: v1.0
 */
public class CaculateNumber {
    public static void main(String[] args) {
        caculate(2, 5);
    }

    public static int caculate(int num, int count) {
        int temp = 0;
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            temp = (temp * 10) + num;
            sum += temp;
        }
        System.out.println("sum = "+sum);
        return sum;

    }
}
