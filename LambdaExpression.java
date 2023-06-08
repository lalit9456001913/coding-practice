import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Alice");
        names.add("Bob");

        // Using lambda expression with forEach to print each name
        names.forEach(name -> System.out.println(name));

        System.out.println();

        // Using lambda expression with filter to filter names starting with "J"
        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(name -> System.out.println(name));

        System.out.println();

        // Using lambda expression with map to convert names to uppercase
        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));
    }
}
