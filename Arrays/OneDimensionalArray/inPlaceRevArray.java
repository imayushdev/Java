package OneDimensionalArray;

import java.util.Scanner;

public class inPlaceRevArray {
    public static void main(String[] args) {

        System.out.println("Enter the number of elements of array");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int [ ]arr=new int[n];
        System.out.println("Enter the elements of array");
        for (int i=0;i<arr.length;i++){
           arr[i]=scanner.nextInt();
        }
        System.out.println("Entered array elements are:");
        for (int i : arr) {
            System.out.println(i);

        }
        System.out.println("Reversed array is :");
       int Start =0;int end =arr.length-1;
       while(Start<end){
          //for(int i=0;i<arr.length/2;i++){
               int temp=arr[Start];
               arr[Start]=arr[end];
               arr[end]=temp;
               Start++;
               end--;


       }
        for (int j : arr) {
            System.out.println(j);

        }

    }
}