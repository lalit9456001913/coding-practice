class Books extends Product {
    public Books(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return this.getPrice()*5/100;
    }
}