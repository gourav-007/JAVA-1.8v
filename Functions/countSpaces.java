import java.util.function.Function;

class countSpaces{
    public static void main(String[] args) {
        Function<String, Integer> f = input -> input.length() - input.replaceAll(" ", "").length();
        System.out.println(f.apply("   Count number of spaces in me    "));
    }
}
