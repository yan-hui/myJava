package hch.lone.wolf.interview;

/**
 * @Description 有1, 2, 3, 4 个数字，能组成多少个不同且无重复数字的三位数
 * @Author hechunhui
 * @Created 2019/1/2 22:36
 */
public class NoReple {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(100 * i + 10 * j + k);
                        count++;
                    }
                }
            }
        }
        System.out.println("数量： " + count);
    }
}
