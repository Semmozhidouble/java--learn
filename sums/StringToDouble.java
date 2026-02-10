package sums;
import java.util.Scanner;
public class StringToDouble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        double d=Double.parseDouble(str);
        System.out.println(d);
        sc.close();
        
    }
    
}
