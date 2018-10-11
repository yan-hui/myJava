package hch.lone.wolf.base.number;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @Description Java Math 类
 * @Author hechunhui
 * @CreatedBy 2018/10/11 14:05
 */
public class MathTest {
    /**
     * 三角函数
     */
    @Test
    public void trigonometricFunction(){
        System.out.println("90 度的正弦值： "+Math.sin(Math.PI/2));
        System.out.println("0 度的余弦值： "+Math.cos(0));
        System.out.println("60 度的正切值： "+Math.tan(Math.PI/3));
        System.out.println("1 的反正切值： "+Math.atan(1));
        System.out.println("π/2的角度值： "+Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);

    }

    /**
     * number转其它数值类型
     */
    @Test
    public void numberToXXX(){
        Number number = 123;
        System.out.println(number.intValue());
        System.out.println(number.shortValue());
        System.out.println(number.longValue());
        System.out.println(number.doubleValue());
        System.out.println(number.floatValue());

    }

    @Test
    public void numberMethod(){
        String number = "12345";
        System.out.println(Integer.parseInt(number));
        System.out.println(Double.parseDouble(number));
        System.out.println(Float.parseFloat(number));
        System.out.println("------------------------");
        Integer num = 12344;
        System.out.println(Math.abs(num));
        Double num2 = 123.49;
        System.out.println("往上取整： "+Math.ceil(num2));
        System.out.println("往下取整： "+Math.floor(num2));
        System.out.println("取最近的整数： "+Math.rint(num2));
        System.out.println("四舍五入: "+Math.round(num2));

        Integer in1 = 2222;
        Integer in2 = 333;
        System.out.println("max: "+Math.max(in1,in2));
        System.out.println("min: "+Math.min(in1,in2));
        System.out.println(Math.random());
    }

    /**
     * 获取0-100的随机数
     */
    @Test
    public void getRandomNumber(){
        Random random = new Random();
        //使用Math.random()
        int num = (int)(Math.random() * 100);
        //使用Random()
        int num2 = random.nextInt(100);
        System.out.println(num);
        System.out.println(num2);
    }
    @Test
    public void test(){
      Integer num = 127;
        Integer num2 = 127;
        Integer num3 = 128;
        Integer num4= 128;

        //对-128~127进行缓存，在这之间使用的同一地址，超出的则使用了不同的地址
        System.out.println(num ==num2);
        System.out.println(num.equals(num2));
        System.out.println(num3 ==num4);
        System.out.println(num3.equals(num4));
    }


}
