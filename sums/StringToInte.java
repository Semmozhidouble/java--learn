package sums;
import java.util.Scanner;

public class StringToInte {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int c=Integer.parseInt(str);
        System.out.println(c);
        sc.close();
    }
    
}
