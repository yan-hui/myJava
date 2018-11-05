package hch.lone.wolf.jdk8.newtime;

/**
 * @Description
 * @Author hechunhui
 * @CreatedBy 2018/11/2 9:45
 */
public class User {
	private String name;
	private String code;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", code='" + code + '\'' +
				", age=" + age +
				'}';
	}*/
}
