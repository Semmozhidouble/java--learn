package sums;
import java.util.Scanner;

public class Magic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int sum = num;

        while(sum > 9){
            int temp = sum;
            sum = 0;

            while(temp > 0){
                sum += temp % 10;
                temp /= 10;
            }
        }

        if(sum == 1){
            System.out.println("It is a magic number");
        } else {
            System.out.println("It is not a magic number");
        }
    }
}
