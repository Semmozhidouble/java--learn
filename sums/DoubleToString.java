package sums;
import java.util.Scanner;

public class DoubleToString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the double");
        double d=sc.nextDouble();
        String str=String.valueOf(d);
        System.out.println(str);
        sc.close();
        
    }
    
}
