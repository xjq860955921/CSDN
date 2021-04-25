package api02.a_stringclass;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
    编码问题
 */
public class StringDemo03 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "你好";
        //字符 -> 字节 ->把看得懂的变成看不懂 -> 编码
        byte[] bs = str.getBytes();//默认以utf-8
        //[-28, -67, -96, -27, -91, -67] = 6字节
        System.out.println(Arrays.toString(bs));

        //字节 -> 字符 ->把看不懂的变成看得懂的 -> 解码
        String sUTF = new String(bs,"UTF-8");
        System.out.println(sUTF);//你好

        String sGBK = new String(bs,"GBK");
        System.out.println(sGBK);//浣犲ソ

        //解决乱码:
        byte[] bgbk = sGBK.getBytes("GBK");//按照utf-8
        System.out.println(Arrays.toString(bgbk));
        String sutf = new String(bgbk, "UTF-8");
        System.out.println(sutf);


    }

}
