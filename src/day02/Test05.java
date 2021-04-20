package day02;

import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String regex = "\\w+\\.jpg";
		String regex1 = "\\w+\\.";
		if (s.matches(regex)){
			long l = System.currentTimeMillis();

			System.out.println(s.replaceAll(regex1,System.currentTimeMillis()+"."));
		}
	}
}
