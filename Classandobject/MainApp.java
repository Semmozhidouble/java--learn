package Classandobject;
public class MainApp{
    public static void main(String[] args){
        //object creation
        Vehicle car=new Vehicle();
        //assign values to object variables
        car.brand="supra";
        System.out.println("Brand:"+car.brand);
        //methods calls(object behavior)
        car.speed=0;
        car.start();
        car.accelerate();
        car.accelerate();
        car.stop();
        System.out.println("----------------");
        //another object from same class
        Vehicle bike=new Vehicle();
        bike.brand="Ninja";
        System.out.println("Brand:"+bike.brand);
        bike.speed=0;
        bike.start();
        bike.accelerate();
        bike.stop();
    }
}