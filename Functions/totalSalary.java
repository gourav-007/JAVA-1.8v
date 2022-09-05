import java.util.ArrayList;
import java.util.function.Function;

class Employee{
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    String name;
    double salary;

    @Override
    public String toString() {
        return name+" : "+salary;
    }
}

class TestClass{
    public static void main(String[] args) {
        Function<ArrayList<Employee>,Double> f = input -> {
            double total=0;
            for (Employee e:input){
                total = total + e.salary;
            }
            return total;
        };
        ArrayList<Employee> list =  new ArrayList<>();
        fillEmployeeList(list);
        System.out.println(f.apply(list));
    }

    private static void fillEmployeeList(ArrayList<Employee> list) {
        list.add(new Employee("Gourav",1000));
        list.add(new Employee("Sourav",2000));
        list.add(new Employee("Raj",4000));
        list.add(new Employee("Rohit",200));


    }
}
