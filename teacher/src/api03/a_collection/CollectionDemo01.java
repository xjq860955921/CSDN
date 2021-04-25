package api03.a_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection对象
        Collection col = new ArrayList();//向上造型
        col.add("关羽");
        col.add("张飞");
        col.add("刘备");
        System.out.println(col);

        //问是否包含此元素
        boolean b = col.contains("张飞");
        System.out.println(b);

        //问是否为空
        boolean empty = col.isEmpty();
        System.out.println(empty);

        //删除集合中的元素
        //col.remove("张飞");

        //清除集合
        /*col.clear();
        System.out.println(col);*/

        //通过迭代器获取集合中的元素
        Iterator it = col.iterator();
       /* Object col1 = it.next();
        System.out.println(col1);
        Object col2 = it.next();
        System.out.println(col2);
        //java.util.NoSuchElementException -没有这个元素
        Object col3 = it.next();
        System.out.println(col3);*/

        /*
           1.通过集合长度 进行判断
           2.
         */
        while(it.hasNext()){
            System.out.println("有没有下一个");
            Object o = it.next();
            System.out.println(o);
            /*使用集合的remove()删除元素
                参数传的是 Object
                ConcurrentModificationException
                并发修改异常
                //出现并发问题 : 同一个时间内操作同一个对象
                数量1 -> remove(o) -> 数量0
             */
            //col.remove(o);
            /*调用迭代器中的remove()
                删除游标所在位置上的元素
             */
            //it.remove();
            System.out.println(col);
        }
        System.out.println("------------");

        //简易版迭代器 - forEach
        //:前 -> 获得集合中的对象的临时变量
        //:后 -> 要迭代的数组/集合
        for (Object o:col) {
            //不能使用迭代器中的remove()
            //it.remove();
            System.out.println(o);
        }
        
        //遍历/迭代 数组
        int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }

        for ( int i : arr) {
            System.out.println(i);

        }


    }
}
