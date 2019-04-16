package hch.lone.wolf.interview;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/25 15:14
 */
public class PrintResult extends B {
    public int f(int i,int j){
        return super.f(i,j);
    }

    public int f(int j) {

        return -j;
    }

    public static void main(String[] args) {
        B x  =new PrintResult();
        System.out.println(x.f(5,10)+" "+x.f(4)+" "+x.f('A'));
    }

}

class B {
    public int f(int i) {
        return i + i;
    }

    public int f(int i, int j) {
        return i + j;
    }

    public int f(char c) {
        return c;
    }
}