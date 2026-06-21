package ExceptionHandeling;

public class tryCatch {
    public static void main(String[] args) {
        int a = 10 ;
        int b=0;
        int c=0;
        try {
             c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("zero se devision mat kar lala !!");
            System.out.println(e.getMessage());
        }

    }
}
