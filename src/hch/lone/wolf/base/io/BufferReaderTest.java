package hch.lone.wolf.base.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description
 * @Author hechunhui
 * @CreatedBy 2018/11/22 10:33
 */
public class BufferReaderTest {
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			c = (char)br.read();
			System.out.print(c);

		}while (c!='`');
	}
}
