package sums;

public class greaterthan100 {
    public static void main(String[] args) {
        int sum =150;
        for(int i=1;i<=50;i++){
            if(sum>100){
                sum=sum+i;
                System.out.println("sum is greater than hundred"+sum);

            }
            else {
                System.out.println("sum is less than hundred"+sum);
            }
        }
    }
    
}
