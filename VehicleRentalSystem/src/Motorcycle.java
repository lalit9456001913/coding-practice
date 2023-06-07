public class Motorcycle implements Rental,Drivable{
    int id;
    String make;
    String model;
    double price;

    Boolean status=false;
    public Motorcycle( int id,String make,String model, double price){
        this.id=id;
        this.make=make;
        this.model=model;
        this.price=price;
    }
    @Override
    public double calculateRentalCost(int numberOfDays) {
        return numberOfDays*this.price;
    }

    @Override
    public Boolean start(){
        status=true;
        return status;
    }

    @Override
    public double drive(int distance) {
        return 0;
    }
    @Override
    public void displayVehicleDetails() {
        System.out.println("id--"+this.id);
        System.out.println("make--"+this.make);
        System.out.println("model--"+this.model);
        System.out.println("price--"+this.price);
    }
}
