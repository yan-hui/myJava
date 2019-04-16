package hch.lone.wolf.interview;

/**
 * @description: 水仙花数
 * 水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）
 * @author: hch
 * @create: 2019/3/12 20:01
 * @version: v1.0
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
      int num=100;
      while (num<999){
          int b=num/100;
          int s = (num-b*100)/10;
          int g = num-b*100-s*10;
          if (Math.pow(b,3)+Math.pow(s,3)+Math.pow(g,3)==num){
              System.out.println(num);
          }
          num++;

      }


    }

}
