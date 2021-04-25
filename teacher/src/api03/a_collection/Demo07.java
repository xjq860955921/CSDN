package api03.a_collection;

import java.util.ArrayList;

/*
    删除引用类型对象
 */
public class Demo07{
    public static void main(String[] args) {

        ArrayList<Student>  list = new ArrayList<>();
        list.add(new Student("小明",12,"男"));
        list.add(new Student("小红",12,"女"));
        System.out.println(list);
        list.add(new Student("小红",12,"女"));

        list.remove(new Student("小红",12,"女"));

        System.out.println(list);




    }
}
