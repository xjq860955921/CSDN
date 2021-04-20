package day02;
/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Staff staff = new Staff("张三", 25, "男", 5000);
        Staff staff1 = new Staff("李四", 26, "女", 6000);
        Staff[] arr = {staff,staff1};
        for (Staff staff2 : arr) {
            System.out.println(staff2);
        }
    }
}
class Staff{
    String name;
    int age;
    String gender;
    int salary;

    public Staff() {
    }

    public Staff(String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}