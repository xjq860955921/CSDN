package api03.b_genrityClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class  Demo01 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(1);
        col.add(3.14);
        col.add('h');
        col.add("String");
        col.add(new Date());
        System.out.println(col);

        Iterator it = col.iterator();
        while(it.hasNext()){
            Object o = it.next();
            /*System.out.println(o + 1);*/
        }
    }
}
