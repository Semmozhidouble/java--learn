package sums;
import java.util.Scanner;
public class DoubleToStrings {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a double number:");
        double num = sc.nextDouble();
        int integer = (int) num;
        double d = num - integer;
        char[] ch = new char[20];
        int i = 0;
        if(integer==0){
            System.out.println("0");
        }
        

        

    }
}
