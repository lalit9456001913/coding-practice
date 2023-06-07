abstract class Product {
    private int id;
    private String name;
    private double price;

    public double getPrice(){
        return price;
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayProductDetails() {
        double discount = calculateDiscount();
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
        System.out.println("Discount Amount: $" + discount);
        System.out.println("Price after Discount: $" + (price - discount));
    }
}