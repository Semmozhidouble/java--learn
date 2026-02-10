package sums;
import java.util.Scanner;

public class StringToChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        char c=str.charAt(0);
        System.out.println(c);
        sc.close();
        
    }
    
}
