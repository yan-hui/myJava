package hch.lone.wolf.base.abstractC;

/**
 * @Description
 * @Author hechunhui
 * @CreatedBy 2018/11/23 10:58
 */
public abstract class Animal {
private String name;
private String color;

	public Animal() {
		System.out.println("init animal");
	}

	public void run(){
		System.out.println("animal running....");
	}
	public abstract  void sleep();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
