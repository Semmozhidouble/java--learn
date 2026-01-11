package Classandobject;

public class Vehicle {
    protected String brand;
    protected int speed;
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setSpeed(int speed){
        if(speed>=0){
            this.speed=speed;
        }
    }
    public void start() {
        System.out.println("Vehicle started");
    }

    public void accelerate() {
        speed = speed + 10;
        System.out.println("Speed increased to: " + speed);
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }
}