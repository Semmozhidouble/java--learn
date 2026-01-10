//method overloading example
//package declaration
package methods;
//class declaration
public class squaremethod {
    public static void main(String[] args){
//method calling with int argument  because jvm looks for a method named square with one int parameter and inside the same class and it must be static because main is static.       
        square(5);
        double result=square(2.5);
        System.out.println(result);

    }
//static method    were method overloading is done 
//first method with int parameter 
    static void square(int n){
        // inside method n*n-> 5*5=25
        System.out.println(n*n);
    }
//second method with double parameter    
    static double square(double number){
        
        return number * number;

    }
}
