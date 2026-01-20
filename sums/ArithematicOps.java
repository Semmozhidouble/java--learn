package sums;
import java.util.Scanner;

public class ArithematicOps {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("sum= "+(a+b));
        System.out.println("Difference= "+(a-b));
        System.out.println("product= "+(a*b));
        System.out.println("quotient= "+(a/b));


    }
}
