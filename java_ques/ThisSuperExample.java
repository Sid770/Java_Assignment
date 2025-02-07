// question 6

// Parent class (Superclass)
class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand; // Using 'this' to differentiate instance variable
    }

    public void display() {
        System.out.println("Vehicle brand: " + brand);
    }
}

// Child class (Subclass)
class Car extends Vehicle {
    int speed;

    public Car(String brand, int speed) {
        super(brand); // Using 'super' to call the parent class constructor
        this.speed = speed;
    }

    public void showDetails() {
        super.display(); // Using 'super' to call the parent class method
        System.out.println("Car speed: " + this.speed + " km/h"); // Using 'this' to refer to instance variable
    }
}

// Main class
public class ThisSuperExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120);
        myCar.showDetails();
    }
}
