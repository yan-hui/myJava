package hch.lone.wolf.thread;

/**
 * @Description 启动10个线程，每个线程都对 i 加10次，最后结果为100
 * @Author hechunhui
 * @CreatedBy 2018/11/5 17:13
 */
public class ThreadDemo implements Runnable {
	private Node node;

	public ThreadDemo(Node node) {
		this.node = node;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			node.add();
			System.out.println(Thread.currentThread().getName() + ": " + node.getI());
		}
	}

	public static void main(String[] args) {
		Node node1 = new Node();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread((new ThreadDemo(node1)), "thread - " + i);
			thread.start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("i: " + node1.getI());

	}
}

class Node {
	private int i = 0;

	public int getI() {
		return i;
	}

	public synchronized void add() {
		i++;
	}
}