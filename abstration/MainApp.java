package abstration;

public class MainApp {
    public static void main(String[] args){
        Vehicle car=new Car("toyota");
        Vehicle bike=new Bike("yamaha");
        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
    
}
