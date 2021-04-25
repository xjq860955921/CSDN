package api02.b_packingclass;
/*
    Integer的常量池
 */
public class IntegerDemo02 {
    public static void main(String[] args) {
        /*Integer有常量池 但是常量池有范围:
            byte取值范围: -128 ~ 127
         */
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);//true 200:false

    }
}
