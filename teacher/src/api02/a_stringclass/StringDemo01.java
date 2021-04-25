package api02.a_stringclass;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
    String的初始化
 */
public class StringDemo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //直接赋值
        String s1 = "hello";
        System.out.println(s1);
        //构造方法创建
        String s2 = new String();
        System.out.println(s2);
        byte[] bs ={97,98,99,100};
        String s3 = new String(bs);
        System.out.println(s3);//abcd
        String s4 = new String(bs, "Gbk");
        String s = new String(s1);

        char[] cs = {'h','e','l','l','o'};
        String s5 = new String(cs);
        System.out.println(s5);
        System.out.println("_______________");

        int[] arr = {1,2,3,4};
        System.out.println(arr);//[I@50cbc42f
        System.out.println(Arrays.toString(arr));
        char[] c = {'h','i'};
        System.out.println(c);//hi -> 字符串 -> 字符数组
        //一定重写过toString()
        System.out.println(Arrays.toString(c));//[h, i]

        //字符串一旦创建就不可变
        String str = "hello";
        str = "hi";
        String str1 = str;

    }
}
