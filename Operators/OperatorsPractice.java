package Operators;

public class OperatorsPractice {
    public static void main(String[] args) {
        //  int a=5, b=6;
//        System.out.println(a+-b);
//        System.out.println(a>b?a:b);
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);
//other cases
        //System.out.println(a+-b);
        //System.out.println(a>b?a:b);
//        System.out.println("The result is:"+a+b);//0/p ->56 concatenation
//        System.out.println ("the result is :"+ (a-b));//error not a-b in string
//        System.out.println ("The resuult is;"+a*b);//without() still work
//        System.out.println("The result is; "+ a/b);//for+,*,/,%
//        System.out.println("The result is; "+ a%b);//not for - low precedence +no concatenation
//Arithmetic on character
//Character ch1='A',Ch2 ='B'; //character store as unsigned int
        //    System.out.println(ch1+Ch2);
        //    System.out.println(" "+ch1+Ch2);//concatenation-->>AB
//all possible ;

//short hand operator

  //int a=5;

 //tricky be attentive its not shorthand___>>>>a=+10;
   //a=+5;//unary plus
       // System.out.println(a);
       // a=-5;
      //  System.out.println(a);
    //Actual shorthand operator---->>> a+=10

//int A= 5;
//A++;
//        System.out.println(A);//increment by one only
//
//A+=10;
//        System.out.println(A);//Increment by any no
//same for Characters

//int c = 10;
//c+=7.5;
//
//        System.out.println(c);//o/p-->>17
//        //c-=7.5;
//
int a= 10, b= 20;
int result = a+b - b++ + ++a - a++ * ++b;
int result1= a++ - ++a;
int result2=  ++a - a++;
        System.out.println(result);


    }




}