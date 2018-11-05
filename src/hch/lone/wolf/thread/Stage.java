package hch.lone.wolf.thread;

/**
 * @Description 战场
 * @Author hechunhui
 * @CreatedBy 2018/11/5 16:43
 */
public class Stage extends Thread{
	@Override
	public void run() {
		System.out.println("欢迎收看隋唐演义");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("大幕徐徐拉开");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("话说隋朝末年，隋军和农民起义军杀的昏天黑地....");

		//创建军队
		ArmyRunnable armyTaskOfSuiDynasty =  new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt =  new ArmyRunnable();
		
		//创建线程
		Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty, "隋军");
		Thread armyOfRevolt = new Thread(armyTaskOfRevolt, "农民军");
		//启动线程，军队开始对战
		armyOfSuiDynasty.start();
		armyOfRevolt.start();
		//战场线程休眠
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//发送军令收兵
		armyTaskOfSuiDynasty.keepRunning=false;
		armyTaskOfRevolt.keepRunning=false;

		try {
			armyOfRevolt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("正当双方激战正酣，半路杀出个程咬金！");
		KeyPerson mrCheng = new KeyPerson();
		mrCheng.setName("程咬金");
		System.out.println("老陈的梦想就是结束战争，使百姓安居乐业！");
		//停止军队作战,让出舞台资源给关键人物
		armyTaskOfSuiDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning=false;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//关键人物登场
		mrCheng.start();
		//等待老陈完成历史使命
		try {
			//其它线程需要等待此线程执行完
			mrCheng.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("战争结束，人民安居乐业，老陈完成了自己的梦想.....");
		System.out.println("谢谢观看，再见！！");

	}

	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.start();

	}
}
