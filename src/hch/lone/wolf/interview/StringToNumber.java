package hch.lone.wolf.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: zero、one、two、three、four、five、six、seven、eight、nine对应0-9
 * 对一段只有这些字符组成的字符串，进行转换，数字先后不考虑
 * @author: hch
 * @create: 2019/4/16 11:20
 * @version: v1.0
 */
public class StringToNumber {

    public static void main(String[] args) {
        String str = ("onezerotwofourfivezero");
        String num = getNmu(str);
        System.out.println(num);

    }

    public static String getNmu(String strNum) {
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        String result = "";
        while (!"".equals(strNum)) {
            if (strNum.startsWith("on") || strNum.startsWith("tw") || strNum.startsWith("si")) {
                result = result + map.get(strNum.substring(0, 3));
                strNum = strNum.substring(3);
            }
            if (strNum.startsWith("ze") || strNum.startsWith("fo") || strNum.startsWith("fi") || strNum.startsWith("ni")) {
                result = result + map.get(strNum.substring(0, 4));
                strNum = strNum.substring(4);
            }
            if (strNum.startsWith("ei") || strNum.startsWith("th") || strNum.startsWith("se")) {
                result = result + map.get(strNum.substring(0, 5));
                strNum = strNum.substring(5);
            }
        }

        return result;
    }


}
