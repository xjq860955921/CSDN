package api02.b_packingclass;
/*
    包装类的使用
 */
public class IntegerDemo01 {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        //创建
        //直接赋值 - 非常常用
        Integer i1 = 10;
        //构造方法创建
        Integer i2 = new Integer(10);
        //String -> Integer
        Integer a = new Integer("123");
        System.out.println(a);



    }
}
