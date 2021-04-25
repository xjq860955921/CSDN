package api02.a_stringclass;

import java.util.Arrays;

public class StringRegexDemo07 {
    public static void main(String[] args) {
        //判断是否符合正则表达式的要求
        /* 需求1: 电话号码11 第一位 1开头 10位随意数字*/
        String str = "15356297421";
        String regex = "^[0-9][0-9]{10}$";
        boolean matches = str.matches(regex);
        System.out.println(matches);

        /*需求2: 163.com  -> Eoron_7788@163.com*/
        String email = "Eoron_7788@163.com";
        //regex: [A-Za-z]\w{5,17}@163\.com
        String regex1 = "[A-Za-z]\\w{5,17}@163\\.com";
        boolean matches1 = email.matches(regex1);
        System.out.println(matches1);
        System.out.println("_________________________");

        //全部替换
        String s1 = "哈哈哈qndy,啊sss,啊sss";
        String regex2 = "(qndy)|(sss)|(xxxx)";
        String s = s1.replaceAll(regex2, "****");
        System.out.println(s);
        System.out.println("----------------");

        //切割
        String s3 = "String123Array456Object789";
        String regex3 = "\\d+";
        String[] split = s3.split(regex3);
        System.out.println(Arrays.toString(split));
    }
}
