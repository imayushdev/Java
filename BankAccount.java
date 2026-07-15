package OOPS.basicPractice;

import java.util.Scanner;

public class BankAccount {
    private String Account_Number ;
    private String Account_Holder_Name;
    private Double Balance =0d;
    private Long Phone_Number;

    public Double getBalance() {

        return Balance;
    }

    public void setBalance(Double balance) {
        Balance = balance;
    }

    public String getAccount_Number() {
        return Account_Number;
    }

    public void setAccount_Number(String account_Number) {
        Account_Number = account_Number;
    }

    public String getAccount_Holder_Name() {
        return Account_Holder_Name;
    }

    public void setAccount_Holder_Name(String account_Holder_Name) {
        Account_Holder_Name = account_Holder_Name;
    }

    public Long getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(Long phone_Number) {
        Phone_Number = phone_Number;
    }

    void deposit(int Deposit_Amount){
        if(Deposit_Amount<0) {
            Balance += Deposit_Amount;
        }
        else{
            System.out.println("Please enter the valid amount!!");
        }
    }
    void Withdraw (int Withdraw_Amount){
        if(Withdraw_Amount<0) {
            Balance -= Withdraw_Amount;
        }
        else{
            System.out.println("Please enter the valid amount!!");
        }
    }
    void display(){
        System.out.println("The Account number is :"+ Account_Number);
        System.out.println("The Name of Account Holder is :"+Account_Holder_Name);
        System.out.println("Phone Number : "+Phone_Number);
        System.out.println("The Balance is : "+ Balance +"₹");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount object = new BankAccount();
        System.out.println("Enter the Account Number");
        object.Account_Number=scanner.nextLine();
        System.out.println("Enter the Name of Account holder");
        object.Account_Holder_Name=scanner.nextLine();
        System.out.println("Enter the phone number");
        long Phone_Number =scanner.nextLong();
        int choice;
        do {
            System.out.println("Press one for Deposit");
            System.out.println("Press two for withdraw");
            System.out.println("Press Zero for details");
             choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter the Amount you want to deposit");

                int Deposit_Amount = scanner.nextInt();
                object.deposit(Deposit_Amount);
            } else if (choice == 2) {
                System.out.println("Enter the Amount you want to withdraw");
                int Withdraw_Amount = scanner.nextInt();
                object.Withdraw(Withdraw_Amount);
            }
            else {
                System.out.println("Please enter valid choice !!");
            }
        }while(choice>2|| choice<0);
        object.display();
    }

}
