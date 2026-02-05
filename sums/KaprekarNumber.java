package sums;
import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int sqrt=num*num;
        int left=0;
        int right=0;
        int count=0;
        while(temp>0){
            temp=temp%10;
            temp=temp/10;
            count++;            
        }
        for(int i=0;i<count;i++){
            right=sqrt%10;
            left=sqrt/10;


    }
    
}
