import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class TestClass{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);

        List<Integer> list = al.stream().map(I->I*2).collect(Collectors.toList());
        System.out.println(list);
    }
}
