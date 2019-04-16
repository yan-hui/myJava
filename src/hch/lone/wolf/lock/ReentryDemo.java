package hch.lone.wolf.lock;

import java.util.concurrent.locks.Lock;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/13 18:10
 */
public class ReentryDemo {

    private Lock lock = new MyLock();

    public void methodA() {
        lock.lock();
        System.out.println("进入方法A");
        methodB();
        lock.unlock();
    }

    public void methodB() {
        lock.lock();
        System.out.println("进入方法B");
        lock.unlock();
    }

    public static void main(String[] args) {
        ReentryDemo reentryDemo = new ReentryDemo();
        reentryDemo.methodA();
    }
}
