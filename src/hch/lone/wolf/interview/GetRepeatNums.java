package hch.lone.wolf.interview;

import java.util.*;

/**
 * @description: 从数组中找出重复元素及其所在位置
 * @author: hch
 * @create: 2019/3/12 20:31
 * @version: v1.0
 */
public class GetRepeatNums {
    //{12, 18, 19, 15, 26, 29, 49, 15, 12, 19, 29, 12, 18}
    public static void main(String[] args) {
        int[] arr = {12, 18, 19, 15, 26, 29, 49, 15, 12, 19, 29, 12, 18};
        Map<Integer, List<Integer>> numMap = getNumMap(arr);
        print(numMap);
    }

    public static Map<Integer, List<Integer>> getNumMap(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = map.get(arr[i]);
            if (null == list) {//说明不存在
                list = new ArrayList<>(1);
                map.put(arr[i], list);
            }
            list.add(i);//存在，直接修改引用list的值
        }
        return map;
    }

    public static void print(Map<Integer, List<Integer>> map) {
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            if (list.size() > 1) {
                String str = Arrays.toString(list.toArray());
                str = str.substring(1, str.length() - 1);
                System.out.println(entry.getKey() + "-->" + str);
            }
        }
    }

}
