package hch.lone.wolf.base.character;


import org.junit.Test;

/**
 * @Description Character类
 * @Author hechunhui
 * @CreatedBy 2018/10/11 14:52
 */
public class CharacterTest {
   @Test
    public void methodTest(){
       //isLetter是否是字母
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter('5'));
       System.out.println("--------------------------");
        //是否是数字字符
       System.out.println(Character.isDigit('A'));
       System.out.println(Character.isDigit('5'));
       System.out.println("--------------------------");
        //空格
       System.out.println(Character.isWhitespace(' '));
       System.out.println("--------------------------");

       //大小写字母
       System.out.println(Character.isUpperCase('A'));
       System.out.println(Character.isUpperCase('a'));

       System.out.println(Character.isLowerCase('A'));
       System.out.println(Character.isLowerCase('a'));
       System.out.println("--------------------------");

       System.out.println(Character.toUpperCase('a'));
       System.out.println(Character.toUpperCase('A'));
       System.out.println(Character.toLowerCase('a'));
       System.out.println(Character.toLowerCase('A'));
   }
}
