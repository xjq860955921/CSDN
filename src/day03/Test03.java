package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入生日：");
        String str = scanner.nextLine();
        //String str = "1998-10-26";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = new Date();
        long time1 = date1.getTime();
        //System.out.println(time1);

        Date date2 = simpleDateFormat.parse(str);
        //System.out.println(date2);
        long time2 = date2.getTime();
        //System.out.println(time2);
        long time = time1 - time2;
        //System.out.println(time);
        time/=24*60*60*1000*7;
        System.out.println(time+"周");


    }
}
