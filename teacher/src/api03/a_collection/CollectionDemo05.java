package api03.a_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/*
    集合转换成数组 - toArray()
 */
public class CollectionDemo05 {
    public static void main(String[] args) {
        Collection<Object> col = new ArrayList();
        col.add(1);
        col.add(3.14);
        col.add(new Date());

        //集合转换成数组
        Object[] obj = col.toArray();
        System.out.println(Arrays.toString(obj));

        Collection<String> col2  = new ArrayList<>();
        col2.add("张飞");
        col2.add("刘备");
        /*
            toArray() - 跟规定的泛型无关
            无参toArray() 返回值类型只能是Object
         */
        //Object[] obj2 = col2.toArray();

        //toArray(T<>) - T 代表String
        /*
            参数: 跟数组的长度无关
                  只是需要这个参数数组类型
         */
        String[] str = col2.toArray(new String[0]);
        System.out.println(Arrays.toString(str));

        //使用一个集合构造另一个集合
        ArrayList<Object> list = new ArrayList<>(col2);
        list.add("lucy");
        list.add("marry");
        System.out.println(list);
    }
}
