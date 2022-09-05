import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+" : "+salary;
    }
}

class Main {
    public static void main(String[] args) {
        Function<Employee,Employee> f = input->{
            input.salary = input.salary + 477;
            return input;
        };
        Predicate<Employee> e = e1->e1.salary<3500;
        ArrayList<Employee> list1 = new ArrayList<>();
        ArrayList<Employee> list2 = new ArrayList<>();
        fillEmployeeList(list1);
        System.out.println("Salary Before Increment");
        System.out.println(list1);

        for (Employee e1 : list1){
            if (e.test(e1)){
                list2.add(f.apply(e1));
            }
        }

        System.out.println("New Salary After Increment.....");
        System.out.println(list2);
    }


    private static void fillEmployeeList(ArrayList<Employee> list) {
        list.add(new Employee("Gourav", 1000));
        list.add(new Employee("Sourav", 2000));
        list.add(new Employee("Raj", 4000));
        list.add(new Employee("Rohit", 200));

    }
}
