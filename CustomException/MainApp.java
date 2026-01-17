package CustomException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            BankAccount account=new BankAccount(5000);
            System.out.println("Enter amount to withdraw:");
            int amount=sc.nextInt();
            account.withdraw(amount);

        }catch(InsufficientBalanceException e){
            System.out.println("Error:"+e.getMessage());
        }catch(Exception e){
            System.out.println("something went wrong");
        }finally{
            sc.close();
            System.out.println("Transaction completed");
        }

    }
    
}
