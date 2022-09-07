import java.util.function.BiFunction;

class Employee{
    public Employee(String ename, int eno, double dailywages) {
        this.ename = ename;
        this.eno = eno;
        this.dailywages = dailywages;
    }

    String ename;
    int eno;
    double dailywages;
}

class Timesheet{
    public Timesheet(int eno, int days) {
        this.eno = eno;
        this.days = days;
    }

    int eno;
    int days;

}

class TestClass{
    public static void main(String[] args) {

        Employee e =  new Employee("Gourav",101,1000);
        Timesheet t = new Timesheet(101,25);

        BiFunction<Employee,Timesheet,Double> f = (e1,t1)->e.dailywages*t.days;

        System.out.println("Monthly Salary : " + f.apply(e, t));
    }
}
