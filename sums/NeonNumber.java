package sums;
import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        int sqrt=num*num;
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }if(num==sum){
            System.out.println("It is a neon number");

        }else{
            System.out.println("It is not a neon number");
        }
    }
    
}
