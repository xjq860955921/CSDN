package api02.a_stringclass;
/*
    Stirng 和 StirngBuilder 和 StringBuffer
    的效率对比
    StirngBuilder -> StringBuffe -> String
 */
public class StirngBuilderDemo08 {
    public static void main(String[] args) {
       String str = " ";
       StringBuilder str1 = new StringBuilder("");
       StringBuffer str2 = new StringBuffer("");
        /*long time1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            //每一次拼接都会产生新的对象
            str = str + i;//字符串的拼接
        }
        System.out.println(time2-time1);*/
        long time2 = System.currentTimeMillis();
        //StringBuffer的拼接
        for (int i = 0; i < 10000000; i++) {
            str2.append(i) ;
        }
        long time3 = System.currentTimeMillis();
        System.out.println(time3-time2);

        //StringBuilder的拼接
        for (int i = 0; i < 10000000; i++) {
           str1.append(i);
        }
        long time4 = System.currentTimeMillis();
        System.out.println(time4-time3);

    }
}
