package solidPrinciples;



interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    // constructor and other methods

    public double calculateArea() {
        return width * height;
    }
}

class Circle implements Shape {
    private double radius;

    // constructor and other methods

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args){
    Rectangle rec=new Rectangle();
    Circle cir=new Circle();
    System.out.println(rec.calculateArea());
    System.out.println(cir.calculateArea());
    }
}
