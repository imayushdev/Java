package Basics.Variables;
public class Variable {
    //instance variables
    static int a = 19;//initialization(it is static and can print directly without object)
    int next_no=a+1;//expression
    double A = 10.0;
    float C = 10.0000000f;
    final double pi = 3.149f;//literals fixed value
    static int b = 10;

    void display() {
       int d;   //local variable(inside block)
        d=25;  //assigning allowed in local
        System.out.println("THE no is :" + a);
        System.out.println("The no is :" + A);
        System.out.println("The no is :" + C);
    }

    public static void main(String[] args) {
        Variable object = new Variable();
       // object.display();
        System.out.print("The no is :" + a);
    }
}

