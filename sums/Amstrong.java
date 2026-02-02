package sums;
import java.util.Scanner;
public  class Amstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int digits = String.valueOf(num).length();
        int sum=0;
        while(num>0){
            int sqrt=num%10;
            sum+=Math.pow(sqrt,digits);
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Amstrong Number");
        }
        else{
            System.out.println("Not an Amstrong Number");
        }
    }
}