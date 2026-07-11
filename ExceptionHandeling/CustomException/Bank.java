package ExceptionHandeling.CustomException;

public class Bank {
    private double balance = 10000;
    public void withdraw(double amount)  throws InsufficientFundsException{
        if (amount > balance)  {
            throw new InsufficientFundsException("Not enough balance in your account");
        }
        balance -= amount;
        System.out.println("Transaction successful");
    }
}
