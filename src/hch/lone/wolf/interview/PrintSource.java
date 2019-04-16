package hch.lone.wolf.interview;

/**
 * @description: 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示
 * @author: hch
 * @create: 2019/2/21 23:06
 * @version: v1.0
 */
public class PrintSource {
    public static void main(String[] args) {
        grade(10.21);
        grade(101);
        grade(99);
        grade(69);
        grade(59);
    }

    public static void grade(double num){
        if (num>100||num<0){
            System.out.println("分数无效");
        }else{
            String str = (num>90)?"分 "+num+"等级为A":(num<60)?"分 "+num+" 等级为C":"分 "+num+"等级为B";
            System.out.println(str);
        }
    }

}
