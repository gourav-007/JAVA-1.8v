import java.util.function.Function;

class RemoveSpace{
    public static void main(String[] args) {
        System.out.println(getStringStringFunction().apply("This is String which contains spaces"));
    }

    private static Function<String, String> getStringStringFunction() {
        Function<String,String> f = s-> s.replaceAll(" ","");
        return f;
    }
}
