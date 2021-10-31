import java.io.RandomAccessFile;
import java.io.Serializable;

public class Employee {
    int age;

    public Employee(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Employee e = new Employee(18);
        int a = 5;
        // здесь в переменную е перезаписывается ссылка на новый объект с возрастом 45
        foo(e);
        foo2(a);
        System.out.println("a = " + a);
        System.out.println("a = " + foo2(a));
        System.out.println("e.age = " + e.age);
        System.out.println("foo(e).age = " + foo(e).age);

        int [] str = {1, 2};
        System.out.println("str.getClass() = " + str.getClass());

    }
    static Integer foo2(int a) {
        a = 10;
        return a;
    }
    static Employee foo(Employee e2) {
        e2 = new Employee(47);
        return e2;
    }
}