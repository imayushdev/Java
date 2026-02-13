package Baisic_Class_Objects;

public class Bankacc{
    String Name;
    int Balance;
    void Showbalance(){
        System.out.print("The bank balance in your account is :"+Balance+'₹');
    }
    void details(){
        System.out.print("\nThe account holder Name :"+Name+"\nThe bank Balace is:"+Balance);
    }
}
class Bank{
    public static void main(String[] args){
        Bankacc object= new Bankacc();
        object.Name = "Ayush";
        object.Balance=1000000;
        object.Showbalance();
        object.details();
    }
}