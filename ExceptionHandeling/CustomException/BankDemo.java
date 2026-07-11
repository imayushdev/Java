package ExceptionHandeling.CustomException;

public class BankDemo {
    public static void main(String[] args)  {
        Bank bank = new Bank();
        try {
            bank.withdraw(10001);
        }catch (InsufficientFundsException e){
            System.out.println(e.getMessage());

        }

    }
}
