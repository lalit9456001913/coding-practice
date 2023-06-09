
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello, World!");

        // Checking if a value is present
        if (optionalValue.isPresent()) {
            String value = optionalValue.get();
            System.out.println(value);
        }

        // Performing an action if a value is present
        optionalValue.ifPresent(value -> System.out.println("Value is present: " + value));

        // Providing a default value if a value is absent
        Optional<String> optionalEmpty = Optional.empty();
        String result = optionalEmpty.orElse("Default Value");
        System.out.println(result);

        // Performing an action if a value is absent
        optionalEmpty.ifPresentOrElse(
                value -> System.out.println("Value is present: " + value),
                () -> System.out.println("Value is absent"));

        // Mapping the value if present
        Optional<Integer> optionalLength = optionalValue.map(String::length);
        optionalLength.ifPresent(length -> System.out.println("Length: " + length));
    }
}
