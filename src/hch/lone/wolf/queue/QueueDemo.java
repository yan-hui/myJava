package hch.lone.wolf.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @description: 模拟银行排队
 * @author: hch
 * @create: 2019/2/15$ 16:47$
 * @version: v1.0
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Request> queue = new ArrayDeque<Request>();
        for (int i = 0; i < 10; i++) {
            final int num = i;
            queue.offer(new Request() {
                @Override
                public void depoist() {
                    System.out.println("第" + num + "个人办理存款，金额为：" + (Math.random() * 10000));
                }
            });
        }
        //处理业务
        dealWith(queue);
    }

    public static void dealWith(Queue<Request> queue) {
        Request req = null;
        while (null != (req = queue.poll())) {
            req.depoist();
        }
    }
}

interface Request {
    /**
     * 存款
     */
    void depoist();
}