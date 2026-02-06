package polymorphism;

public class MainClass {

    public static void main(String[] args){
        Animal animal= new Animal();
        animal.sound();
        animal=new Dog();
        animal.sound();
        animal=new Cat();
        animal.sound();    
        animal=new Tiger();
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
static class Cat extends Dog{
    @Override
    void sound(){
        System.out.println("cat meows");
    }
}
static class Tiger extends Cat{
    @Override
    void sound(){
        System.out.println("tiger roars");
    }
}
static void perform(Animal animal){
    animal.sound();
}
}
