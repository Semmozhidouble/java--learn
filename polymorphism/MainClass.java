package polymorphism;

public class MainClass {

    public static void main(String[] args){
        Animal animal= new Animal();
        animal.sound();
        animal=new Dog();
        animal.sound();

    
     
}
static class Animal{
    void sound(){
        System.out.println("The Animal Makes Sound");
    }

}
static class Dog extends Animal{
    @Override
    void sound(){
    System.out.println("Dog barks");
}
}
}