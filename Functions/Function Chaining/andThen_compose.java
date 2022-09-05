import java.util.function.Function;

class TestClass{
    public static void main(String[] args) {
        Function<String,String> f1 = input-> input.toUpperCase();
        Function<String, String> f2 = input -> input.substring(0,6);

        System.out.println(f1.apply("gouravjain"));
        System.out.println(f2.apply("gouravjain"));

        //In case of andThen f1 will execute first then followed by f2
        System.out.println(f1.andThen(f2).apply("gouravjain"));
        //In case of compose f2 will execute first then f1;
        System.out.println(f1.compose(f2).apply("gouravjain"));
        
    }
}
