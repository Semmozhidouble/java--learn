package sums;
import java.util.Scanner;

public class TotalAverage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int total=a+b+c;
        float average=total/3.0f;
        System.out.println("total="+total);
        System.out.println("aVERAGE="+average);

    }
    
}
