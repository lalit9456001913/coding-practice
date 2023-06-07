public class Main {
    public static void main(String[] args) {
        Product electronics = new Electronics(1, "Smartphone", 500.0);
        Product clothing = new Clothing(2, "T-Shirt", 25.0);
        Product books = new Books(3, "Novel", 20.0);

        electronics.displayProductDetails();
        System.out.println("------------------------");
        clothing.displayProductDetails();
        System.out.println("------------------------");
        books.displayProductDetails();

    }
}