package api02.a_stringclass;
/*
    常用API 1
 */
public class StringDemo04 {
    public static void main(String[] args) {
        String str = "hello";

        //获取字符串长度
        int length = str.length();
        System.out.println(length);

        //跟字符相关的方法
        //获得指定下标的字符
        char c = str.charAt(1);
        System.out.println(c);
        //将字符串转换成字符数组
        char[] chars = str.toCharArray();
        System.out.println(chars);

        //跟字符串的输出大小写有关的方法
        String s1 ="gbk";
        String s2 ="Gbk";
        String s3 ="GBK";
        System.out.println(s1.equals(s2));//false
        //全转换成小写
        s2 = s2.toLowerCase();
        System.out.println(s1.equals(s2));//true
        //全转换成大写
        s2  = s2.toUpperCase();
        System.out.println(s3.equals(s2));
        //忽略大小写
        boolean b = s2.equalsIgnoreCase(s1);
        System.out.println(b);///true




    }
}
