package api02.b_packingclass;
/*

 */
public class IntegerDemo03 {
    public static void main(String[] args) {
        Integer i1 = 20;
        //Integr -> int
        //i2 = i1.intVlue() -> 自动装箱 -> JVM内中完成
        int i2 = i1;//直接赋值
        //int -> Integr
        //i1 = Integr.valueOf() -> 自动拆箱 -> JVM内中完成
        i1 = i2;

        /*
            判断两个对象是否一致 - 看字节码文件是否一致
         */
        //获取Integer字节码文件
        Class c1 = i1.getClass();
        //获取int类型的字节码文件
        Class c2 = int.class;
        System.out.println(c1 == c2);//false


        //不同进制的parseInt的使用
        Integer i5 = 10;
        int i = i5.parseInt("e", 16);
        System.out.println(i);
        int i3 = i5.parseInt("0010", 2);
        System.out.println(i3);


    }
}
