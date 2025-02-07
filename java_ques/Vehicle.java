// question 7

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public String getModel() {
        return this.model;
    }
}
