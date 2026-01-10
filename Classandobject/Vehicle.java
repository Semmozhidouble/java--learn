package Classandobject;

public class Vehicle {

    String brand;
    int speed;

    void start() {
        System.out.println("Vehicle started");
    }

    void accelerate() {
        speed = speed + 10;
        System.out.println("Speed increased to: " + speed);
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}