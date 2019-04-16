package hch.lone.wolf.thread;

import java.util.concurrent.*;

/**
 * Callable实现多线程
 * 优点：可以获取返回值
 * Callable规定的方法是call()，而Runnable则是run()
 * call()可以抛出异常，而run()不行
 * Future表示异步计算的结果，它提供了检查计算是否完成的方法，以等待计算的完成，并检索计算的结果。
 * 通过Future对象可了解任务的执行情况，可取消任务的执行，还可获取任务执行的结果
 * 过程：
 *      创建Callable实现类，重写call()
 *      借助任务调度ExecutorService获取Future对象
 *      获取值
 *      停止服务
 * @author: hch
 * @create: 2019/4/14 20:47
 * @version: v1.0
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ser = Executors.newFixedThreadPool(2);
        Race tortoise = new Race("乌龟", 1000L);
        Race rabbit = new Race("兔子", 500L);
        //获取值
        Future<Integer> result1 = ser.submit(tortoise);
        Future<Integer> result2 = ser.submit(rabbit);
        Thread.sleep(2000);
        //停止线程循环
        tortoise.setFlag(false);
        rabbit.setFlag(false);

        Integer num1 = result1.get();
        Integer num2 = result2.get();
        System.out.println("乌龟跑了-->" + num1 + "步");
        System.out.println("兔子跑了-->" + num2 + "步");
        ser.shutdown();

    }
}

class Race implements Callable<Integer> {
    private String name;
    //延迟时间
    private Long time;
    private boolean flag = true;
    //步数
    private int step = 0;

    public Race() {
    }

    public Race(String name, Long time) {
        this.name = name;
        this.time = time;
    }


    @Override
    public Integer call() throws Exception {
        while (flag) {
            Thread.sleep(time);
            step++;
        }
        return step;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }


}