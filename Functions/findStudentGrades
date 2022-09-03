import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    String name;
    int marks;
}

class TestClass{
    public static void main(String[] args) {
        Predicate<Student> checkMarks = s -> s.marks>=60;
        Function<Student,String> f = input -> {
         int marks = input.marks;
         if (marks>=80)
             return "A Grade";
         else if (marks>=60)
             return "B Grade";
         else if (marks>=50)
             return "C Grade";
         else if (marks>=35)
             return "D Grade";
         else
             return "E Grade";
        };
        ArrayList<Student> list = new ArrayList<>();
        fillStudentList(list);

        for (Student s : list){
            if (checkMarks.test(s)) {
                System.out.println("name :" + s.name);
                System.out.println("marks :" + s.marks);
                System.out.println("grade :" + f.apply(s));
            }
        }
    }

    private static void fillStudentList(ArrayList<Student> list) {
        list.add(new Student("Gourav",80));
        list.add(new Student("Sourav",100));
        list.add(new Student("Varsha",40));
        list.add(new Student("Kalyani",85));
    }
}
