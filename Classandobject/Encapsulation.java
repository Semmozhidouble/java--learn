package Classandobject;

public class Encapsulation {

    // 🔒 private variables (ENCAPSULATION)
    private String brand;
    private int speed;

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand (uses this keyword)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Setter for speed with validation
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative");
        }
    }

    // Object behavior methods
    public void start() {
        System.out.println(brand + " vehicle started");
    }

    public void accelerate() {
        speed = speed + 10;
        System.out.println("Speed increased to: " + speed);
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    // 🚪 MAIN METHOD (ENTRY POINT)
    public static void main(String[] args) {

        // Object creation
        Encapsulation car = new Encapsulation();

        // Setting values using setters
        car.setBrand("Toyota");
        car.setSpeed(0);

        // Using object behavior
        car.start();
        car.accelerate();
        car.accelerate();
        car.stop();

        // Getting values using getters
        System.out.println("Final Speed: " + car.getSpeed());
    }
}
