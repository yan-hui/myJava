package hch.lone.wolf.interview;

/**
 * @Description 输入一个数字123456，反序输出
 * @Author hechunhui
 * @Created 2018/12/25 17:07
 */
public class ResverInt {
    public void resever(int num){
        if (num>0){
            int tmp = num%10;
            System.out.print(tmp);
            int n = num/10;
            resever(n);
        }
    }

    public static void main(String[] args) {
        ResverInt anInt = new ResverInt();
        anInt.resever(123456);


    }
}
