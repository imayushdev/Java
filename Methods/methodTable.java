package Methods;

import java.util.Scanner;

public class methodTable {
   static int i,num;
    static void tableOfNum(int num){
        for (i=1;i<=10;i++){
            System.out.println(" "+num + "*" +i+ "=" + num*i);
        }
      return;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number whose table you want to print");
        Scanner scanner = new Scanner(System.in);
        methodTable object = new methodTable();
        num = scanner.nextInt();
      tableOfNum(num);

    }


}
