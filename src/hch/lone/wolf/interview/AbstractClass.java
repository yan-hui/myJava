package hch.lone.wolf.interview;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/25 15:39
 */
public class AbstractClass extends GetTime{
    @Override
    public void code() {
        for (int i=0;i<1000;i++){
            System.out.println(i);
        }
    }



    public static void main(String[] args) {
        GetTime g= new AbstractClass();
        g.getTime();
    }
}
abstract class GetTime{
    public final void getTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("毫秒："+(end-start));
    }
    public  abstract void code();

}

