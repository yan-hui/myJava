package hch.lone.wolf.interview;

import java.math.BigDecimal;

/**
 * @description: 定一个方法在主函数书数中调用，用于计算俩个浮点数的相加值
 * @author: hch
 * @create: 2019/2/21 23:15
 * @version: v1.0
 */
public class AddDouble {
    public static void main(String[] args) {
        add(1.336,952.25);
        subtract(30.2,12);
        multiply(12.2,13.5);
        divide(50,20);
    }

    /**
     * 加
     * @param num1
     * @param num2
     */
    public static void add(double num1, double num2) {
        BigDecimal result = BigDecimal.valueOf(num1).add(BigDecimal.valueOf(num2));

        System.out.println(result);
    }

    /**
     *
     * 减
     * @param num1
     * @param num2
     */
    public static void subtract(double num1, double num2) {
        BigDecimal result = BigDecimal.valueOf(num1).subtract(BigDecimal.valueOf(num2));

        System.out.println(result);
    }

    /**
     * 乘
     * @param num1
     * @param num2
     */
    public static void multiply(double num1, double num2) {
        BigDecimal result = BigDecimal.valueOf(num1).multiply(BigDecimal.valueOf(num2));

        System.out.println(result);
    }

    /**
     * 除
     * @param num1
     * @param num2
     */
    public static void divide(double num1, double num2) {
        BigDecimal result = BigDecimal.valueOf(num1).divide(BigDecimal.valueOf(num2));

        System.out.println(result);
    }


}
