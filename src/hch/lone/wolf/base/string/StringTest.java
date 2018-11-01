package hch.lone.wolf.base.string;

import org.junit.jupiter.api.Test;

/**
 * @Description String类相关方法
 * @Author hechunhui
 * @CreatedBy 2018/10/11 15:10
 */
public class StringTest {
    @Test
    public void methodTest() {
        String str = "www.cctv.com";
        System.out.println(str.length());
        System.out.println("charAt: " + str.charAt(7));
        int compareTo = str.compareTo("www.cctv.com");
        //根据字符一一比较 w-w  c-c
        if (compareTo == 0) {
            System.out.println("相等");
        } else {
            System.out.println("不等");
        }
        System.out.println("abcd".compareTo("abc"));
        System.out.println("abc".compareTo("abcd"));
        System.out.println("AbcD".compareToIgnoreCase("AbC"));

        System.out.println("sdf".contentEquals(new StringBuffer("sdf")));

        char[] str1 = {'a', 'b', 'c', 'd', 'e', ' ', 'f', 'g', 'h', 'i', 'j'};
        String str2 = "";
        str2 = String.copyValueOf(str1);
        System.out.println("return：" + str2);
        //从下标2开始截取5个
        str2 = String.copyValueOf(str1, 2, 5);
        System.out.println("return：" + str2);

    }

    @Test
    public void methodTest2() {
        String str1 = "www.cctv.com";
        String str2 = "www.ccTV.com";
        System.out.println("是否按指定字符结尾： " + str1.endsWith("com"));
        System.out.println("是否以指定字符开始："+str1.startsWith("ww"));
        System.out.println("忽略大小写比较： " + str1.equalsIgnoreCase(str2));

        byte[] bytes = str1.getBytes();
        System.out.println(bytes);
        System.out.println(str1.hashCode());
    }

    @Test
    public void methodTest3() {
        String str = "www.cctv.com";
        //第一次出现的索引
        System.out.println(str.indexOf("c"));
        System.out.println(str.indexOf(99));
        //指定所有开始查找
        System.out.println(str.indexOf("c", 6));

        System.out.println(str.intern());

        System.out.println(str.lastIndexOf("c"));
        System.out.println(str.lastIndexOf("c", 8));

        System.out.println("----------------------------------");
        String str1 = "cctv.com";
        String str2 = "CCTV.COM";

        //是否忽略大小写，第一个字符开始的位置，第二个字符串对象，第二字符串的开始的位置，比较几个
        System.out.println(str.regionMatches(4, str1, 0, 5));
        System.out.println(str.regionMatches(4, str2, 0, 5));
        System.out.println(str.regionMatches(true, 4, str2, 0, 5));

        System.out.println("-----------------------------------");

    }

    @Test
    public void methodTest4() {
        String str = "www.cctv.com";
        System.out.println("替换后：" + str.replace('c', 'p'));
        String str1 = "www.cctv.com";
        System.out.println("替换字符串： " + str1.replaceAll("cctv", "tianmao"));
        String str2 = "abcdef";
        System.out.println("替换第一个：" + str2.replaceFirst("abc", "qwe"));
    }

    @Test
    public void splitTest() {
        String str = "www.cctv.com";
        String[] splitArr = str.split("\\.");
        System.out.println(splitArr);
        for (String s :splitArr){
            System.out.println(s);
        }
        /**
         * limit为分割成几分
         */
        String[] splitArr2 = str.split("\\.", 1);
        for (String s :splitArr2){
            System.out.println("s2: "+s);
        }
        String str3 = "select * from account where id = 1 and age >15 or name like %anni%";
        String[] splitArr3 = str3.split("and|or");
        for (String s :splitArr3){
            System.out.println("s3: "+s);
        }
    }
    @Test
    public void subTest(){
        String str = "www.cctv.com";
        //[0,4),包左不包右
        System.out.println("subSequence: "+str.subSequence(0,4));
        System.out.println("subString: "+str.substring(3));
        //[0,4)包左不包右
        System.out.println("subString2: "+str.substring(0,4));
    }

    @Test
    public void methodTest5(){
        String str = "wWw.CcTv.com";
        System.out.println("lowCare "+str.toLowerCase());
        System.out.println("upCare "+str.toUpperCase());
        System.out.println("valueOf "+String.valueOf(12.22));
        System.out.println("---------------------------");
        char[] chars = str.toCharArray();
        System.out.println(chars);
        for (char ch :chars){
            System.out.print("ch--"+ch+",");
        }
    }
}
