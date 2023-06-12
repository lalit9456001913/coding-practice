package solidPrinciples;


class ARectangle {
    public double width;
    public double height;

    // constructors, getters, and setters

    public double calculateArea() {
        return width * height;
    }

    protected void setWidth(double width) {
    }

    protected void setHeight(double width) {
    }
}

class Square extends ARectangle {
    // overrides setters to ensure width and height are always equal

    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

class LSP{
    public static void main(String[] args){
     System.out.println("inside substitute liskow principle");
    }
}

  //  In the above example, Square is a subtype of Rectangle, but it overrides the setters to ensure that the width and height are always equal. Despite the differences in behavior, the Square object can be substituted for a Rectangle object, respecting the Liskov Substitution Principle.