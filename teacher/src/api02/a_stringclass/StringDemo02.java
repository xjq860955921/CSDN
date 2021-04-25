package api02.a_stringclass;
/*
    常量池
 */
public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";
        String s4 = "hello";

        System.out.println(s1 == s2);//false
        System.out.println(s3 == s4);//true
        System.out.println("------------");

        String s5 = "he";
        String s6 = "hello";
        //直接量/字面量/常量 + 常量 -> 常量一致
        String s7 = "he" + "llo";
        //变量 + 常量 -> 常量不一致
        String s8 = s5 + "llo";
        System.out.println(s6 == s7);//true
        System.out.println(s6 == s8);//false
    }
}
