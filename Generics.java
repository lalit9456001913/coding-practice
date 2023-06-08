// Generic class
class Box<T> {
    private T item;

    public void setItem(T inputItem) {
        this.item = inputItem;
    }

    public T getItem() {
        return this.item;
    }
}

// Generic method
class Utils {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// Main class
public class Generics {
    public static void main(String[] args) {
        // Create a Box of Integer type
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(10);
        int intValue = integerBox.getItem();
        System.out.println("Integer value: " + intValue);

        // Create a Box of String type
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello, world!");
        String stringValue = stringBox.getItem();
        System.out.println("String value: " + stringValue);

        // Create an array of integers
        Integer[] intArray = { 1, 2, 3, 4, 5 };

        // Create an array of strings
        String[] stringArray = { "Apple", "Banana", "Orange" };

        // Print the arrays using the generic method
        Utils.printArray(intArray);
        Utils.printArray(stringArray);
    }
}


// advantage
// => 1.Type-safety: We can hold only a single type of objects in generics. It doesn?t allow to store other objects.
// => 2.Type casting is not required: There is no need to typecast the object. Before Generics, we need to type cast.
// => 3. Compile-Time Checking: It is checked at compile time so problem will not occur at runtime. The good programming strategy says it is far better to handle the problem at compile time than runtime.