import java.util.List;

public class StreamCallenge {
    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        List<String> sortedResult = names.stream().sorted().toList();
        List<String> result = names.stream().filter(name -> name.contains("y")).toList();
        System.out.println(sortedResult);
        System.out.println(result);
    }
}