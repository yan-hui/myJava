package hch.lone.wolf.base;

/**
 * @Description
 * @Author hechunhui
 * @CreatedBy 2018/11/21 17:54
 */
public class Test {


	public static void main(String[] args) {
		System.out.println(Person.name);
		String s1="aa";
		String s2="aa".intern();
		System.out.print(s1==s2);


	}
}
