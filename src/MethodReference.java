import java.util.List;
public class MethodReference {
    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}