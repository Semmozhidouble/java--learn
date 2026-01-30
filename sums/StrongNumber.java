package sums;
import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0){
            int n=temp%10;
            int fact=1;
            for(int i=0;i<=n;i++){
                fact=fact*i;
            }
            sum+=fact;
            temp=temp/10;
            if(sum==num){
                System.out.println("Strong number");
                break;
            }else{
                System.out.println("Not a strong number");
                break;
            }

        }
    }
    
}
