package a_collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("张飞");
        col.add("刘备");
        col.add("关羽");
        System.out.println(col);

        //创建一个集合
        Collection col2 = new ArrayList();
        col2.add("小乔");
        col2.add("大桥");
        //将col2中所有的元素添加到col中
        col.addAll(col2);
        //col:[张飞, 刘备, 关羽, 小乔, 大桥]
        System.out.println(col);


        Collection col3 = new ArrayList();
        col3.add("周瑜");
        col3.add("小桥");
        //col:[张飞, 刘备, 关羽, 小乔, 大桥]
        boolean b = col.containsAll(col3);//false
        System.out.println(b);


        Collection col4 = new ArrayList();
        col4.add("大桥");
        col4.add("小乔");
        //col:[张飞, 刘备, 关羽, 小乔, 大桥]
        col.removeAll(col4);
        System.out.println(col);

    }
}
