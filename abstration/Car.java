package abstration;

public class Car extends Vehicle {
    Car(String brand){
        super(brand);
    }
    @Override
    void start(){
        System.out.println(brand+" car started");
    }
    
}
