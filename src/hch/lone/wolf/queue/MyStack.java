package hch.lone.wolf.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @description: 使用队列实现自定义堆栈
 * 1、弹栈
 * 2、压栈
 * 3、获取
 * @author: hch
 * @create: 2019/2/15$ 17:13$
 * @version: v1.0
 */
public class MyStack<E> {
    //容器
    private Deque<E> container = new ArrayDeque<E>();
    //容量
    private int cap;

    public MyStack(int cap) {
        this.cap = cap;
    }

    /**
     * 压栈
     *
     * @param e
     * @return
     */
    public boolean push(E e) {
        if (container.size() + 1 > cap) {
            return false;
        }
        return container.offerLast(e);
    }

    /**
     * 弹栈
     *
     * @return
     */
    public E pop() {
        //获取并移除此双端队列的最后一个元素；如果此双端队列为空，则返回 null
        return container.pollLast();
    }

    /**
     * 获取
     *
     * @return
     */
    public E peek() {
        //获取，但不移除此双端队列的最后一个元素；如果此双端队列为空，则返回 null
        return container.peekLast();
    }

    public int size() {
        return container.size();
    }
}
