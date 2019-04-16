package hch.lone.wolf.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/14 16:01
 */
public class ReentrantReadWriteLockDemo {
    private  int num = 0;
    private int num2 = 0;
    private ReadWriteLock lock= new ReentrantReadWriteLock();
    Lock readLock = lock.readLock();
    Lock writeLock=lock.writeLock();
    public  void out(){
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" num的值--->"+num+",num2的值--->"+num2);
        }finally {
            readLock.unlock();
        }
    }


    public void inCreate(){
        writeLock.lock();
        try {
            num++;
            Thread.sleep(500L);
            num2++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            writeLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantReadWriteLockDemo reentrantReadWriteLockDemo = new ReentrantReadWriteLockDemo();
        new Thread(()->{
            reentrantReadWriteLockDemo.out();
        },"读线程").start();

        //new Thread(()->{
        //    reentrantReadWriteLockDemo.inCreate();
        //},"写线程").start();
        new Thread(()->{
            reentrantReadWriteLockDemo.out();
        },"读线程2").start();

        new Thread(()->{
            reentrantReadWriteLockDemo.out();
        },"读线程3").start();
    }
}
