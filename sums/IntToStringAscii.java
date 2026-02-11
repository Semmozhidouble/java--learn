package sums;
import java.util.Scanner;
public class IntToStringAscii{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==0){
            System.out.println("converted to string" +num);
            
            return;
        }
        char ch=new char[50];
        while (num > 0) {
            int digit = num % 10;
            ch[index++] = (char) ('0' + digit);
            num = num / 10;
        }
        sc.close();
    }
}