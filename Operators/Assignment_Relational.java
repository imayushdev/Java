package Operators;

public class Assignment_Relational {
    public static void main(String[] args) {
       int a= 10 ;
       int b = a+3*6 ;
      // int c = b = a ; //= makes equal no calc matters
       int c = a = b;   //keep in mind about precedence and associativity
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }






}
