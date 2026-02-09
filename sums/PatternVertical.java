package sums;
import java.util.Scanner;
public class PatternVertical{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stars needed:");
        int n=sc.nextInt();
        star(n);
        horizontal(n);
        sc.close();

    }
    static void star(int n){
        for(int i=1;i<=n;i++){
            System.out.println("*");
        }
    }
    static void horizontal(int n){
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
    }
    
    

}