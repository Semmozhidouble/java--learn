package abstration;

abstract class Vehicle {
    String brand;
    Vehicle(String brand){
        this.brand=brand;
    }
    //abstract method
    abstract void start();
    void stop(){
        System.out.println("vehicle stopped");
    }
    
}
