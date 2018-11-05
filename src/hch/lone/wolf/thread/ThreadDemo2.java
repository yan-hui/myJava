package hch.lone.wolf.thread;

/**
 * @Description 编写10个线程，第一个线程从1加到10，第二个线程从11加到20 ..第十个线程从91加到100
 * @Author hechunhui
 * @CreatedBy 2018/11/5 17:28
 */
public class ThreadDemo2 extends Thread{
	int number;

	public ThreadDemo2(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		int count=0;
		for(int i=0;i<10;i++){
			synchronized (ThreadDemo2.class){
			count+=number+i;
		}}
		System.out.println(number+"+"+(number+1)+"+...+"+(number+9)+"="+count);
	}

	public static void main(String[] args) {
		for (int i=0;i<10;i++){
			int k = i*10+1;
			ThreadDemo2 threadDemo2 = new ThreadDemo2(k);
			threadDemo2.start();
		}
	}
}
