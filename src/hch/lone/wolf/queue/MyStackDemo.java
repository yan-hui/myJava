package hch.lone.wolf.queue;

/**
 * @description: 测试自定义堆栈
 * @author: hch
 * @create: 2019/2/15$ 17:18$
 * @version: v1.0
 */
public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>(3);
        stack.push("小黑");
        stack.push("大白");
        stack.push("小王");
        stack.push("大王");
//        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println("------");
        String item = null;
        while (null!=(item = stack.pop())){
            System.out.println(item);
        }

    }
}
