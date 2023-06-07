public class Main {
    public static void main(String[] args) {
        Bicycle bycle=new Bicycle(1,"Tata","1234",230);
        bycle.displayVehicleDetails();
        System.out.println("total rent cost--"+bycle.calculateRentalCost(6));
        System.out.println("======================");
        Car car=new Car(2,"Tata","1234",231);
        car.displayVehicleDetails();
        System.out.println("total rent cost--"+bycle.calculateRentalCost(6));
        System.out.println("======================");
        Motorcycle motorcycle=new Motorcycle(3,"Tata","1234",232);
        motorcycle.displayVehicleDetails();
        System.out.println("total rent cost--"+bycle.calculateRentalCost(6));
    }
}