package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String regex = "^\\d+\\.\\d+\\.\\d+\\.\\d+$";
        if (s.matches(regex)){
            String[] split = s.split("^\\.&");
            System.out.println(Arrays.toString(split));
        }else {
            System.out.println("输入错误地址");
        }
    }
}
