package sums;
import java.util.Scanner;


public class TempConvert {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in celcius: ");
        float c= sc.nextFloat();
        float f=(c*9/5)+32;
        System.out.println("The fahrenhet are: "+f);

    }
    
}
