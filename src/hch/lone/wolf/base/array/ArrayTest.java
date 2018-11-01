package hch.lone.wolf.base.array;

import org.junit.jupiter.api.Test;

/**
 * @Description 数组测试
 * @Author hechunhui
 * @CreatedBy 2018/10/12 11:09
 */
public class ArrayTest {
    @Test
    public void arrayTest() {
        int size = 5;
        String[] srtArr = new String[size];
        srtArr[0] = "A";
        srtArr[1] = "B";
        srtArr[2] = "C";
        srtArr[3] = "D";
        for (String str : srtArr) {
            System.out.println("str--" + str);
        }
    }

    @Test
    public void arrayTest2() {
        //第一个为行，第二个为列
        String[][] strArr = new String[3][2];
        strArr[0][0] = "name";
        strArr[0][1] = "age";
        strArr[1][0] = "anni";
        strArr[1][1] = "18";
        strArr[2][0] = "dan";
        strArr[2][1] = "22";
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                System.out.print(strArr[i][j] + "  ");


            }
            System.out.println();
        }
    }

    @Test
    public void arrayTest3() {
        //第一个为行，第二个为列
        String[][][] strArr = new String[2][2][2];
        strArr[0][0][0] = "A";
        strArr[0][0][1] = "B";
        strArr[0][1][0] = "C";
        strArr[0][1][1] = "D";
        strArr[1][0][0] = "E";
        strArr[1][0][1] = "F";
        strArr[1][1][0] = "G";
        strArr[1][1][1] = "H";
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {

                for (int k = 0; k < strArr[i][j].length; k++) {
                    System.out.print(strArr[i][j][k] + "  ");

                }
                System.out.println();

            }
            System.out.println();
        }
    }
}
