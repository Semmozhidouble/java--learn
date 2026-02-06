package Interface;
import java.util.Scanner;

public class Upi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        double amount=sc.nextDouble();
        PaymentService payment=new UpiPayment();
        payment.pay(amount);
    }
interface PaymentService{
    void pay(double amount);

    
}
class UpiPayment implements PaymentService{
    public static void pay(double amount){
        System.out.println("payment"+amount+"via upi");
    }
}

    
}
