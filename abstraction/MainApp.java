package abstraction;

public class MainApp {
    public static void main(String[] args){
        PaymentService upiPayment=new UpiPayment();
        PaymentService cardPayment=new CardPayment();
        upiPayment.pay(1000);
        cardPayment.pay(2000);
    }
    
}
