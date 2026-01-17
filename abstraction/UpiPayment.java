package abstraction;

public class UpiPayment implements PaymentService {
    @Override
    public void pay(double amount){
        System.out.println("Paid " +amount + " via UPI");
    }
    
}
