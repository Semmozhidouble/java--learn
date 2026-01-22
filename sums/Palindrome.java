package sums;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character");
		String str=sc.next();
		int start=0;
		int end = str.length()-1;
		boolean isPalindrome=true;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				isPalindrome=false;
				break;
			}
			start++;
			end--;
		}
		if(isPalindrome) {
			System.out.println("isPalindrome");
			
		}else {
			System.out.println("is not Palindrom");
		}
		
	}

}

    

