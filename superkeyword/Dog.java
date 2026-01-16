package superkeyword;

public class Dog extends Animal {
    String type="Dog";
    Dog(){
        super();
        System.out.println("Dog constructor called");
    }
    @Override
    void sound(){
        super.sound();
        System.out.println("dog barks");
    }
    void printType(){
        System.out.println("child type:"+type);
        System.out.println("parent type:"+super.type);
    }
    
}
