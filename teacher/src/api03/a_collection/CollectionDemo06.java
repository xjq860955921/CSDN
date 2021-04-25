package api03.a_collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
    数组转换成集合 - asList()
 */
public class CollectionDemo06 {
    public static void main(String[] args) {
        String[] str = {"lucy","tom","marry"};
        System.out.println(Arrays.toString(str));

        //数组工具类 -> Arrays
        /*
            asList -> ArrayList
            ArrayList不是 util包下的集合
            是作为Arrays类中的内部类存在
         */
        Collection<String> col = Arrays.asList(str);
        System.out.println(col);
        //修改str数组中下标为1的元素
        str[0] = "张飞";
        /*[张飞, tom, marry]
            集合 和数组使用的是同一块内存空间
         */
        System.out.println(col);

        //给col中添加元素 刘备
        //UnsupportedOperationException - 不支持的操作异常
        col.add("刘备");
        System.out.println(col);

    }
}
