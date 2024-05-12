// Abstract class
abstract class Vehicle {
    String model;
    int year;

    // Constructor
    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Abstract method
    abstract void start();

    // Non-abstract method
    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Concrete class extending the abstract class
class Car extends Vehicle {
    // Constructor
    Car(String model, int year) {
        super(model, year);
    }

    // Implementation of the abstract method
    @Override
    void start() {
        System.out.println("Starting the car...");
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Camry", 2022);
        myCar.displayDetails();
        myCar.start();
    }
}
