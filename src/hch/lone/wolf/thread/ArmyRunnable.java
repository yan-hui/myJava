package hch.lone.wolf.thread;

/**
 * @Description 军队线程
 * @Author hechunhui
 * @CreatedBy 2018/11/5 16:37
 */
public class ArmyRunnable implements Runnable {
	//volatile保证了线程可以正确的读取其它线程写入的值
	//可见性 happens-before原则
	volatile boolean keepRunning = true;

	@Override
	public void run() {
		while (keepRunning) {
			//发动5连击
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "进攻对方[" + i + "]");
				//让出处理器时间，下次攻击方未知
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName() + "结束了战斗！");

	}
}
