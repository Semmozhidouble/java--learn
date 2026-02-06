package Interface;
import java.util.Scanner;

public class Upi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        double amount=sc.nextDouble();
        PaymentService payment=new UpiPayment();
        payment.pay(amount);
        payment=new GpayPayment();
        payment.pay(amount);
        sc.close();
    }
interface PaymentService{
    void pay(double amount);

    
}
static class UpiPayment implements PaymentService{
    @Override
    public void pay(double amount){
        System.out.println("payment "+amount+ " via upi");
    }
}
static class GpayPayment implements PaymentService{
    @Override
    public void pay(double amount){
    System.out.println("payment "+amount+ " via Gpay");
}
}

    
}
