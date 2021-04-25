package b_genrityClass;
/*
    有实际意义的类
 */
public class Demo03Class<T,S> {
    //方法的重载
    /*public void print(int a,int b){
        System.out.println(a + b);
    }
    public void print(int a,double b){
        System.out.println(a + b);
    }
    public void print(String a,int b){
        System.out.println(a + b);
    }*/

    /*
        T: int
        S: String
     */
    public void print(T a,S b){
        System.out.println("print");
    }

}
