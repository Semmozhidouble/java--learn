package sums;
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int sqrt=num*num;
        int divisor=1;
        while(temp>0){
            divisor*=10;
            temp/=10;
        }
        int lastOfDigits=sqrt%divisor;
        if(lastOfDigits==num){

            System.out.println("It is automorphic number");
        }else{
            System.out.println("It is not an Automorphic number");
        }
    }

    
}
