
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

class Employee{
    public Employee(String ename, double salary) {
        this.ename = ename;
        this.salary = salary;
    }

    String ename;
    double salary;
}

class TestClass{
    public static void main(String[] args) {

        BiFunction<String, Double, Employee> e = Employee::new; //Constructor Refrence.
        ArrayList<Employee> al = new ArrayList<>();
        al.add(e.apply("Ravi",500.00));
        al.add(e.apply("Kavi",300.00));

        BiConsumer<Employee,Double> c = (e1,increment)->e1.salary=e1.salary+increment;
        for (Employee e2 : al){
            c.accept(e2,500.00);
        }

        Consumer<Employee> con = (emp)->System.out.println(emp.ename +" : "+ emp.salary);
        for (Employee e3:al) {
            con.accept(e3);
        }
    }
}
