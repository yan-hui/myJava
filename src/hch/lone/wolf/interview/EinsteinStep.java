package hch.lone.wolf.interview;

/**
 * @description: 爱因斯坦台阶问题
 * 有一个长阶梯，若每步上2阶，最后剩下1阶；若每步上3阶，最后剩2阶；若每步上5阶，最后剩下4阶；若每步上6阶，最后剩5阶；
 * 只有每步上7阶，最后刚好一阶也不剩。请问该阶梯至少有多少阶
 * @author: hch
 * @create: 2019/2/21 23:00
 * @version: v1.0
 */
public class EinsteinStep {
    public static void main(String[] args) {
        int num = 1;
        while (true) {
            if (num % 2 == 1 && num % 3 == 2 && num % 5 == 4 && num % 6 == 5 && num % 7 == 0) {
                System.out.println(num);
                break;
            }
            num++;

        }
    }
}
