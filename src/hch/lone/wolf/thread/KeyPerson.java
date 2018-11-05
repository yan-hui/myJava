package hch.lone.wolf.thread;

/**
 * @Description 关键人物
 * @Author hechunhui
 * @CreatedBy 2018/11/5 17:51
 */
public class KeyPerson extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + "开始了战斗！");
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "左突右击，攻击隋军...");

		}
		System.out.println(getName() + "结束了战斗！");
	}
}
