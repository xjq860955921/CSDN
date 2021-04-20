package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入生产日期：");
        String str = scanner.nextLine();
        System.out.println("输入保质期：");
        int num = scanner.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //System.out.println(sdf);

        Date date = sdf.parse(str);
        //System.out.println(date);

        Calendar cal = Calendar.getInstance();
        //System.out.println(cal);
        cal.setTime(date);
        //System.out.println(cal);
        cal.add(Calendar.DATE,num);
        //System.out.println("日"+cal.get(Calendar.DATE));
        cal.add(Calendar.DATE,-7);
        cal.set(Calendar.DAY_OF_WEEK,4);
        Date date1 = cal.getTime();

        System.out.println("促销日："+date1);



    }
}
