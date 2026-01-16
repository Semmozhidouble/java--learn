package polymorphism;

public class Mainapp {
    public static void main(String[] args){
        Animal animal=new Dog();
        animal.sound();
        animal=new Cat();
        animal.sound();
    }
    
}
