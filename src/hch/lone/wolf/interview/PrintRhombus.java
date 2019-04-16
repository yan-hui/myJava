package hch.lone.wolf.interview;

/**
 * @description: 打印菱形
 *    *
 *   ***
 *  *****
 * *******
 *  *****
 *   ***
 *    *
 * @author: hch
 * @create: 2019/3/12 21:14
 * @version: v1.0
 */
public class PrintRhombus {
    public static void main(String[] args) {
        printRhombus(7);
    }

    public static void printRhombus(int size) {
        if (size % 2 == 0) {
            size++; // 计算菱形大小
        }
        int tmp = size/2;
        System.out.println(tmp);
      for (int i=0;i<tmp+1;i++){
          for (int j=tmp+1;j>i+1;j--){
              System.out.print("-");
          }
          for (int j=0;j<2*i+1;j++){
              System.out.print("*");
          }
          System.out.println();
      }
      for (int i=tmp+1;i<size;i++){
          for (int j=0;j<i-tmp;j++){
              System.out.print("-");
          }
          for (int j=0;j<2*size-2*i-1;j++){
              System.out.print("*");
          }
          System.out.println();
      }
    }
}
