package hch.lone.wolf.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/13 18:01
 */
public class MyLock implements Lock {
    /**
     * 重入次数
     */
    private int reenTryCount = 0;
    /**
     * 当前持有锁的线程
     */
    private Thread holdLockThread = null;
    /**
     * 当前线程是否持有锁
     */
    private boolean isHoldLock = false;

    @Override
    public synchronized void lock() {
        if (isHoldLock && Thread.currentThread() != holdLockThread) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        holdLockThread = Thread.currentThread();
        reenTryCount++;
        isHoldLock = true;

    }

    @Override
    public synchronized void unlock() {
        //如果当前线程是持有锁的线程，重入次数减一，不是就不做处理
        if (Thread.currentThread() == holdLockThread) {
            reenTryCount--;
            if (reenTryCount == 0) {
                notify();
                isHoldLock = false;
            }
        }

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }


    @Override
    public Condition newCondition() {
        return null;
    }
}
