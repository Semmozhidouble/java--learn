package sums;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n =sc.nextInt();
		int[] arr=new int[n];
		int evenCount=0,oddCount=0;
		System.out.println("entered the elements:"+n);
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) 
				evenCount++;
			else 
				oddCount++;
				
			
		}
		System.out.println("even count "+evenCount++);
		System.out.println("odd count "+oddCount);
		
		
	}

}

    

