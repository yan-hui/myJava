package hch.lone.wolf.interview;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/25 17:01
 */
public class PrintEquals {
    public static void main(String[] args) {
        AE ae1 = new AE();
        AE ae2 = new AE();
        AE ae3 = ae1;
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = "abc";
        System.out.println(ae1==ae2);
        System.out.println(ae1.equals(ae2));
        System.out.println(ae1==ae3);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
class AE{
    int a = 1;
}