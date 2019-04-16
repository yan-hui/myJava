package hch.lone.wolf.interview;

/**
 * @description: 将s   tr   ing转成s tr ing
 * @author: hch
 * @create: 2019/2/21 22:50
 * @version: v1.0
 */
public class StringReplace {
    public static void main(String[] args) {
        String str = "s   tr     ing";
        str= str.replaceAll("( +)"," ");
        System.out.println(str);
    }
}
