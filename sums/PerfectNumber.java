package sums;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner( System.in); 
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==temp){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
        sc.close();
    }
    
}
