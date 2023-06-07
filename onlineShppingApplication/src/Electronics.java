class Electronics extends Product {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return this.getPrice()*90/100;
    }
}