package api03.b_genrityClass;

import java.util.Date;

public class Demo04Test {
    public static void main(String[] args) {
        /*Demo03Class<Object> dc = new Demo03Class<>();
        dc.print(new Date(),new Date());
        dc.print(1,2);
        dc.print(1,3.14);*/

        Demo03Class<String,Integer> dc = new Demo03Class();
        dc.print("",1);
    }
}
