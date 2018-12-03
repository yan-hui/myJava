package hch.lone.wolf.base.io;

import org.junit.Test;

import java.io.*;

/**
 * @Description
 * @Author hechunhui
 * @CreatedBy 2018/11/22 11:11
 */
public class FileStreamTest {
	private final static String path = "test.txt";
	private final static String dir = "/tmp/java";
	@Test
	public void test1() throws IOException {

		File file = new File(path);
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter writer = new OutputStreamWriter(fos,"UTF-8");
		writer.append("汉皇重色思倾国，御宇多年求不得。");
		writer.append("\r\n");
		writer.append("this is my code");
		writer.close();
		fos.close();

		FileInputStream fis = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(fis, "utf-8");

		StringBuffer sb = new StringBuffer();
		while (reader.ready()){
			sb.append((char)reader.read());
		}
		System.out.println(sb.toString());
		reader.close();
		fis.close();


	}

	@Test
	public void test2(){
		File file = new File(dir);
		file.mkdirs();
		System.out.println("end......");
	}
	@Test
	public void test3(){
		//File file = new File(path);
		File file = new File(dir);
		if (file.isDirectory()){
			System.out.println("目录-->"+dir);
			String[] list = file.list();
			for (String str:list){
				//File file1 = new File(path + "/" + str);
				File file1 = new File(dir + "/" + str);
				if (file1.isDirectory()){
					System.out.println(str+"-->是目录");
				}else{
					System.out.println(str+"-->是文件");
				}
			}
		}else {
			System.out.println(dir+"-->不是目录");
			//System.out.println(path+"-->不是目录");
		}
	}
	@Test
	public void test4(){
		File file = new File(dir);
		delFolder(file);
	}

	/**
	 * 删除文件及目录
	 * @param folder
	 */
	private void delFolder(File folder){

		File[] files = folder.listFiles();
		if(files!=null){
			for (File f:files){
				if (f.isDirectory()){
					delFolder(f);
					System.out.println("删除目录"+f.getName()+"完成...");
				}else{
					f.delete();
					System.out.println("删除文件"+f.getName()+"完成.....");
				}
			}
		}
		folder.delete();
		System.out.println("删除: "+folder.getName());
	}



}
