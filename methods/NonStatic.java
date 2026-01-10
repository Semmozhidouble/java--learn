//package declaration
package methods;
//class declaration
public class NonStatic {
    public static void main(String[] args){
        //create object
        NonStatic obj=new NonStatic();
        //call non static methods using object 
        obj.square(5);
        double result=obj.square(2.5);
        System.out.println(result);
        double cube=obj.cube(2.5);
        System.out.println(cube);
        int age=21;
        if(obj.agecheck(age)){
            System.out.println("you are eligible to vote");
        
        }else{
            System.out.println("you are not eligible for vote");
        }
    }
    //non static method with int parameter
    void square(int n){
        System.out.println(n*n);
    }
    //non static overloaded method with double parameter
    double square(double number){
        return number*number;
    }
    //non static cube method
    double cube(double number){
        return number * number * number;
    }
    //non static boolean method
    boolean agecheck(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }

    
}
