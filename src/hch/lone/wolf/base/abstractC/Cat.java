package hch.lone.wolf.base.abstractC;

/**
 * @Description
 * @Author hechunhui
 * @CreatedBy 2018/11/23 11:00
 */
public class Cat extends Animal{
	private String type;
	@Override
	public void sleep() {
		System.out.println("cat sleep....");
	}

	@Override
	public void run() {
		//super.run();
		System.out.println("cat run");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
