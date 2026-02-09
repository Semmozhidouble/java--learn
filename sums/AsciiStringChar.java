package sums;
import java.util.Scanner;

public class AsciiStringChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        String str=sc.nextLine();
        int ascii=str.charAt(0);
        System.out.println(ascii);
        sc.close();


    }
    
}
