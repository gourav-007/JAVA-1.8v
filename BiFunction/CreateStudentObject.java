import java.util.ArrayList;
import java.util.function.BiFunction;

class Student{
    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    String name;
    int rollno;
}

class TestClass{
    public static void main(String[] args) {
        BiFunction<String,Integer,Student> f = (name,rollno)->new Student(name,rollno);
        ArrayList<Student> al = new ArrayList<>();
        al.add(f.apply("Ravi",500));
        al.add(f.apply("Sunny",300));
        al.add(f.apply("Vijay",100));

        for (Student s:al){
            System.out.println("name :"+s.name);
            System.out.println("rollno :"+s.rollno);
        }
    }
}
