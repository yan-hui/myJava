package hch.lone.wolf.base.string;

import org.junit.jupiter.api.Test;

/**
 * @Description StringBuffer测试，StringBuffer和StringBuilder都不会产生新的未使用对象，
 * StringBuffer线程安全，速度慢于StringBuilder
 * @Author hechunhui
 * @CreatedBy 2018/10/12 10:37
 */
public class StringBufferTest {
    @Test
    public void methodTest(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("www").append(".").append("cctv").append(".").append("com");
        System.out.println("buffer: "+buffer.toString());
        System.out.println("反转："+buffer.reverse().toString());
        buffer = buffer.reverse();
        System.out.println(buffer);
        //[0,4)
        System.out.println("delete: "+buffer.delete(0,4));
        System.out.println(buffer);
        System.out.println("inser: "+buffer.insert(0,"www."));
        //[0,3)
        System.out.println("replace: "+buffer.replace(0,3,"abc"));

    }
    @Test
    public void methodTest2(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("www").append(".").append("cctv").append(".").append("com");
        //初始容量为16
        System.out.println(buffer.capacity());
        //超过则按照 old*2+2
        buffer.append("www").append(".").append("cctv").append(".").append("com");
        System.out.println(buffer.capacity());

        System.out.println("charAt: "+buffer.charAt(4));

    }
    @Test
    public void methodTest3(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("www").append(".").append("cctv").append(".").append("com");
        char[] chars =new char[]{'A','B','c','d'};
        buffer.getChars(0,3,chars,1);
        System.out.println(buffer);
        System.out.println(chars);
    }

}
