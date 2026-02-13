package Methods;

import java.util.Scanner;

public class Greet {
    static String name;
    static String greet (String a){
       return "Welcome "+ name ;


    }

    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner= new Scanner(System.in);
       name =  scanner.nextLine();
       String Greet = greet(name);
        System.out.println(Greet);


    }
}


