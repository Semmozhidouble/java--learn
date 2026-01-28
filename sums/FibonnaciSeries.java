package sums;
import java.util.Scanner;
public class FibonnaciSeries{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int a=0,b=1;
        for(int i=1;i<=num;i++){
            
            int sum=a+b;
            a=b;
            b=sum;
            System.out.println(a+" ");
        }
        sc.close();
    }
}
