package sums;
import java.util.Scanner;

public class CharToString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the char");
        char c=sc.next().charAt(0);
        String str=String.valueOf(c);
        System.out.println(c);
        System.out.println(str);
        sc.close();
        
    }
    
    
}
