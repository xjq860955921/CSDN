package day03;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        //System.out.println(l1);
        Date date1 = new Date(l1);
        System.out.println(date1);
        long l2 = l1+3l*24*3600*1000;
        //System.out.println(l2);
        Date date2 = new Date(l2);
        System.out.println(date2);


    }
}
