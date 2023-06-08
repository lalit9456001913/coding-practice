// Parent class
class Engine {
    public void start() {
        System.out.println("Engine started.");
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }
}

// Composition example - Car class
class Car {
    private Engine engine; // Composition - Car has an Engine

    public Car() {
        engine = new Engine();
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started.");
    }

    public void stopCar() {
        engine.stop();
        System.out.println("Car stopped.");
    }
}

// Main class
public class Composition {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car();

        // Start and stop the car
        car.startCar();
        car.stopCar();
    }
}
