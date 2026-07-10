package OneDimensionalArray;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        int num=0,Greatest, i;
        System.out.println("Enter the number of elements of Array");
        Scanner scanner = new Scanner(System.in);
        num= scanner.nextInt();
        int [] Largest;                  //Array Declaration
         Largest = new int[num];//Array instantiaton of array
        System.out.println("Enter Array Elements");
        Greatest = Largest[0];
         for ( i =0; i<Largest.length;i++){
             Largest[i]=scanner.nextInt();//Taking Input
             if(Largest[i]>Greatest){
                 Greatest = Largest[i];
             }
         }
         System.out.println("The Largest Element is : " + Greatest);
        }


    }
