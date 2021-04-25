package api03.a_collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo04 {
    public static void main(String[] args) {
        //[小乔, 刘备, 张飞, 关羽, 小乔]
        Collection col = new ArrayList();
        col.add("小乔");
        col.add("刘备");
        col.add("张飞");
        col.add("关羽");
        col.add("小乔");
        System.out.println(col);

        //需求:删除集合中所有的小乔名字
        col.remove("小乔");
        //[刘备, 张飞, 关羽, 小乔]
        System.out.println(col);

        Collection col2 = new ArrayList();
        col2.add("小乔");
        col.removeAll(col2);
        //[刘备, 张飞, 关羽]
        System.out.println(col);
        //
    }
}
