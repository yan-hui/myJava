package hch.lone.wolf.test;

/**
 * @description:
 * @author: hch
 * @create: 2019/4/4 21:49
 * @version: v1.0
 */
public class WhatPrint extends base2{
    private String name2 = "what";
    public WhatPrint() {
        tellName();
        printName();
    }
    public void printName() {
        System.out.println("what print-->"+name2);
    }

    public void tellName() {
        System.out.println("what tell -->"+name2);

    }

    public static void main(String[] args) {
        new WhatPrint();
    }
}
class base2{
    private String name = "base";
    public base2(){
        tellName();
        printName();
    }

    public void printName() {
        System.out.println("base print-->"+name);
    }

    public void tellName() {
        System.out.println("base tell -->"+name);

    }
}
