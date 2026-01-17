package CustomException;

public class BankAccount {
    private int balance;
    public BankAccount(int balance){
        this.balance=balance;
    }
    //withdraw method
    public void withdraw(int amount)throws InsufficientBalanceException{
        //Business validation
        if(amount>balance){
            throw new InsufficientBalanceException("withdrawal failed: Insufficient balance");

        }
        balance=balance-amount;
        System.out.println("withdrawal successfull. Remaining balance :"+balance);
    }
    public int getBalance(){
        return balance;
    }
    
}
