package sums;
import java.util.Scanner;
public class PatternShape{
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            System.out.println("*");
            for(int j=1;j<=rows;j++){

                System.out.print("*");
            }
        }
        sc.close();
    
    }

}