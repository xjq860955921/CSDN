package b_genrityClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
    泛型在JVM虚拟机 -> 代码底层下是支持所有类型 Obejct
    泛型作用: 就是用来规范程序员写法的.
    编译时状态:
    运行时状态:支持所有类型 - Object
    xx.java -> 编译(编译器) -> xx.class ->(类加载器) ->  JVM运行
    .java -> 程序员编写的
    .class -> 计算机运行的代码
 */
public class Demo02 {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("张飞");
        col.add("刘备");
        col.add("关羽");
        //[张飞, 刘备, 关羽, 1]
        Demo02.m1(col);
        System.out.println(col);

        //获取迭代器
        Iterator<String> it = col.iterator();
        while(it.hasNext()){
            String s = it.next();
            //ClassCastException - 类型转换异常
            System.out.println(s);
        }
    }

    //添加普通方法
    public static void m1(Collection col){
        col.add(1);
    }
}
