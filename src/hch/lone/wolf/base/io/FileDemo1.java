package hch.lone.wolf.base.io;

import org.junit.Test;

import java.io.File;

/**
 * @description: File常量，路径分隔符和 ;
 *                        名称分隔符win(\) linux (/)
 * @author: hch
 * @create: 2019/3/12 16:32
 * @version: v1.0
 */
public class FileDemo1 {
    @Test
    public void demo1(){
        //分号;
        System.out.println(File.pathSeparator);
        //斜杠或反斜杠
        System.out.println(File.separator);
    //路径表现形式
        String path = "D:\\usr\1.txt";
        path="D:"+File.separator+"usr"+File.separator+"1.txt";

    }


}
