import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            int result = 100 / number;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Program execution complete.");
            scanner.close();
        }
    }
}
