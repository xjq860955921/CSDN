package api02.a_stringclass;

import java.util.Arrays;

/*
    常用API 3
 */
public class StringDemo06 {
    public static void main(String[] args) {
        //去除字符串中前后空白部分
        String str = "    hello    /r/t";
        String trim = str.trim();
        System.out.println(trim);

        // 替换字符串中指定内容
        String s1 = "qndyd,哈哈哈哈哈";
        String re = s1.replace("qndyd", "****");
        System.out.println(re);

        //对字符串进行切割
        String s3 = "haha,heihei,xixi";
        String[] split = s3.split(",");
        System.out.println(Arrays.toString(split));

        //字符串的截取 - 前包含,后不包含
        String substring = s3.substring(0, 4);
        System.out.println(substring);

        //Eoron@7788.@163.com
        String e = "Eoron@7788.@163.com";
        String substring1 = e.substring(e.lastIndexOf("@"));
        boolean b = e.endsWith(substring1);
        System.out.println(substring1);
        System.out.println(b);


    }
}
