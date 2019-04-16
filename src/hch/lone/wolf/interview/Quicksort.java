package hch.lone.wolf.interview;

import java.util.Arrays;

/**
 * @Description 快速排序算法
 * @Author hechunhui
 * @Created 2018/12/19 16:09
 * <p>
 * 原理：选择一个基数，通常是第一个或最后一个元素，通过一趟扫描，将排序分成两部分，一部分比基数小
 * 一部分大于等于基准元素，此时基准元素在其排序好的位置，然后再用同样的方法递归地排序划分的两部分
 * (57)  68  59  52  72  28  96  33  24  (19)
 * 19  (68) 59  52  72  28  96  33  24  (57)
 * 19  (57) 59  52  72  28  96  33  (24) 68
 * 19   24 (59) 52  72  28  96  33  (57) 68
 * 19   24 (57) 52  72  28  96 (33)  59  68
 * 19   24  33 (52) 72  28  96 (57)  59  68
 * 19   24  33  52 (72) 28  96 (57)  59  68
 * 19   24  33  52 (57) 28 (96) 72   59  68
 * 19   24  33  52 (57)(28) 96  72   59  68
 * <p>
 * [19   24  33  52  28]  57  [96  72   59  68]
 */
public class Quicksort {


    private static int getMiddle(int[] list, int low, int high) {
        System.out.println("28-->" + Arrays.toString(list));
        int tmp = list[low];
        while (low < high) {
            while (low < high && list[high] >= tmp) {
            //if (list[high] >= tmp) {
                high--;
            }
            list[low] = list[high];

            System.out.println("36-->" + Arrays.toString(list));

            while (low < high && list[low] <= tmp) {
            //if (list[low] <= tmp) {
                low++;
            }
            list[high] = list[low];

            System.out.println("44-->" + Arrays.toString(list));
        }
        list[high] = tmp;
        System.out.println("47-->" + Arrays.toString(list));
        return low;


    }

    public static void quickSort(int[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);
            quickSort(list, low, middle - 1);
            quickSort(list, middle + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] list = {57, 68, 59, 52, 72, 28, 96, 33, 24, 19};
        int low = 0;
        int high = list.length;
        quickSort(list, low, high - 1);
        System.out.println("结果-->" + Arrays.toString(list));
    }

}
