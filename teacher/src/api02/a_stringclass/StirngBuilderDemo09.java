package api02.a_stringclass;
/*
    StirngBuilder常用API
 */
public class StirngBuilderDemo09 {
    public static void main(String[] args) {
        /*
            StringBuilder append(boolean b) -追加(拼接)
            StringBuilder delete(int start, int end) - 删除
            StringBuilder insert(int offset, char c) - 插入
            StringBuilder reverse()  - 反转 (回文数)
         */
        //创建StirngBuilder
       String str = "hello";
       StringBuilder str1  = new StringBuilder();
       str1.append("hehe");
       System.out.println(str1);
       //将StringBuilder 转换成 String
        String s = str1.toString();

        //构造方法创建 - 传一个String
        StringBuilder h = new StringBuilder("hello");
        h.append("haha");
        h.append("嘻嘻");
        System.out.println(h);

        //删除 - 前包含,后不包含
        h.delete(0,2);
        System.out.println(h);

        //插入
        h.insert(2,"黑");
        System.out.println(h);

        //反转
        h.reverse();
        System.out.println(h);


    }
}
