package InputOutputPractice;//Use of scanner class

import java.io.IOException;
import java.util.Scanner;//package automatically import we checked

public class InputOutput {
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello");
        //System.in.read();//this method have to
        //handle exceptions.
     // int x =  System.in.read();//it gives asci
        //values and read single character
        //drawbacks
     // System.out.print(x);//print asci
        //scanner class
     //  System.out.print("What is your name?");
       //System.out.print("Name is :"Name);

        Scanner scanner=new Scanner(System.in);//standard i/p stream;
      //String firstName=  scanner.next();//only single word or token
        //Delimiter like stop when space;
//        //use to access count individual words
//      System.out.print("The first name is :"+firstName);
//       // Scanner scanner=new Scanner(System.in);
//     System.out.print("Enter second Name");
//      String secondName=  scanner.next();
//      System.out.print("The second name is:"+secondName);
//      String =
     //  String Name =  scanner.nextLine();
       // System.out.print("Name is :"+Name);
//       Addition int
//        System.out.println("Enter first no");
//        int num1=scanner.nextInt();
//        System.out.println("Enter 2nd no:");
//int num2=scanner.nextInt();
//int sum =num1+num2;
        //System.out.println("The sum is :"+sum);
      //float addition
//        System.out.println("Enter first no");
//        float Num1=scanner.nextFloat();
//        System.out.println("Enter 2nd no:");
//        float Num2=scanner.nextFloat();
//        float Sum =Num1+Num2;
//        System.out.println("The sum is :"+Sum);
//byte Method
       System.out.println("Enter first no");
        byte Num1=scanner.nextByte();
        System.out.println (Num1);
       System.out.println("Enter 2nd no:");
       byte Num2=scanner.nextByte();
       byte Sum =(byte)(Num1+Num2);
        System.out.println("The sum is :"+Sum);
//  has next returns boolean type true if in range
//boolean num = scanner.hasNextLong();
//        System.out.println("Enter no:");
//        System.out.println(num);
//


    }


}
