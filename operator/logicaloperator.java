package operator;
public class logicaloperator {
    public static void main(String args[]){
        int a=10;
        int b=20;
        int c=30;
        //find the greatest number among three numbers using logical operator
        System.out.println("a&&b:"+(a>b&&b>a));
        System.out.println("a||b:"+(a>b||b>a));
        System.out.println("a!b"+!(a>b));
        System.out.println("the greatest among three numbers is:"+(a>b && a>c));
        System.out.println("the greatest among three numbers is:"+(b>a && b>c));
        System.out.println("the greatest among three numbers is:"+(c>a && c>b));
        //write a program to ch
        
    

    }
    
}
