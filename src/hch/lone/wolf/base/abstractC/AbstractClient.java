package hch.lone.wolf.base.abstractC;

import java.util.Date;

/**
 * @Description
 * @Author hechunhui
 * @CreatedBy 2018/11/23 11:03
 */
public class AbstractClient<T>{
	public static void main(String[] args) {
		Animal a  = new Cat();
		a.setName("cat");
		a.setColor("orange");
		((Cat) a).setType("猫科");
		System.out.println(((Cat) a).getType());
		System.out.println(a.toString());
		a.run();
		a.sleep();
		System.out.println("------------------");
		Cat cat = new Cat();
		cat.setType("猫科");
		cat.setName("anni");
		cat.setColor("white");
		System.out.println(cat.toString());
		cat.run();
		cat.sleep();
		System.out.println(cat.getType());
		System.out.println(new AbstractClient<>().isIns(""));

	}
	public boolean isIns(T t){
		return t instanceof Date;
	}
}
