package abstration;

public  class Bike extends Vehicle {
    Bike(String brand){
        super(brand);
    }
    @Override
    void start(){
        System.out.println(brand+" bike starts with kick");
    }
    
}
