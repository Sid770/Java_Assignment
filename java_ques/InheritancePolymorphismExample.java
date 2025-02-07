// question 1

// Parent class (Superclass)
class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("This is a vehicle of brand: " + brand);
    }
}

// Child class (Subclass)
class Car extends Vehicle {
    int seats;

    public Car(String brand, int seats) {
        super(brand);
        this.seats = seats;
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a car of brand: " + brand + " with " + seats + " seats.");
    }
}

// Another subclass
class Bike extends Vehicle {
    boolean hasGear;

    public Bike(String brand, boolean hasGear) {
        super(brand);
        this.hasGear = hasGear;
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a bike of brand: " + brand + " and it " + (hasGear ? "has" : "does not have") + " gears.");
    }
}

// Main class
public class InheritancePolymorphismExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", 5);
        Vehicle myBike = new Bike("Yamaha", true);

        myCar.displayInfo();
        myBike.displayInfo();
    }
}
