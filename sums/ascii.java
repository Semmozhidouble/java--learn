package sums;
import java.util.Scanner;
public class ascii {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        int ascii=ch;
        System.out.println("The ascii value are"+ascii);
        sc.close();

    }
    
}
