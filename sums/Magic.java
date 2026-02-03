package sums;
import java.util.Scanner;
public class Magic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(sum>9){
            int temp=sum;
            sum=0;
        
        while(temp>0)
            sum+=digit;
            temp/=10;

        }
        if(sum%10==1){
            System.out.println("It is a magic number");
        }else{
            System.out.println("It not a magic number");
        }
    }
    
}
