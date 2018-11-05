package hch.lone.wolf.thread;

/**
 * @Description
 * @Author hechunhui
 * @CreatedBy 2018/11/5 16:17
 */
public class Actor extends Thread {
	@Override
	public void run() {
		System.out.println(getName()+"是一个演员！！");
		boolean keepRunning = true;
		int count = 0;
		while (keepRunning){
			System.out.println(getName()+"登台演出： "+(++count));
			if (count==100){
				keepRunning=false;
			}
			if (count%10==0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(getName()+"的演出结束了！！");
	}

	public static void main(String[] args) {
		Actor actor = new Actor();
		actor.setName("Mr.Thread");
		actor.start();
		Thread actressThread = new Thread(new Actress(), "Ms.Runnable");
		actressThread.start();
	}
}
class Actress implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"是一个演员！！");
		boolean keepRunning = true;
		int count = 0;
		while (keepRunning){
			System.out.println(Thread.currentThread().getName()+"登台演出： "+(++count));
			if (count==100){
				keepRunning=false;
			}
			if (count%10==0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(Thread.currentThread().getName()+"的演出结束了！！");
	}
}

