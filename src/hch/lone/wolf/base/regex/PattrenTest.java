package hch.lone.wolf.base.regex;


import org.junit.Test;

import java.util.regex.Pattern;

/**
 * @Description Pattern正则测试
 * @Author hechunhui
 * @CreatedBy 2018/10/18 18:06
 */
public class PattrenTest {
	@Test
	public void test(){
		String content = "look at it,www.cctv.com";
		String pattren = ".*cctv.*";
		boolean matches = Pattern.matches(pattren, content);
		System.out.println("contain cctv?--->"+matches);
	}
}
