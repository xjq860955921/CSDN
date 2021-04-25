package api02.a_stringclass;

/*
    常用API 2
 */
public class StringDemo05 {
    public static void main(String[] args) {
        String str = "hello";
        //字符串的拼接
        String s1 = str.concat("./");
        System.out.println(s1);

        //问是否包含指定字符
        boolean contains = str.contains("l");
        System.out.println(contains);

        String ss = " ";
        //字符串是否为空
        boolean empty = str.isEmpty();
        System.out.println(empty);

        //
        // 是不是以 xx 开头 例如: +86
        String phone = "1234566@qq.com";
        boolean b = phone.startsWith("+86");
        System.out.println(b);
        //是不是以 xx 结尾 例如: @163.com  qq.com
        phone.endsWith("@163.com");



    }
}
