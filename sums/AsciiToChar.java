package sums;
import java.util.Scanner;
public class AsciiToChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ascii value:");
        int ascii=sc.nextInt();
        char ch=(char)ascii;
        System.out.println("The character are: "+ch);
        sc.close();


    }
    
}
