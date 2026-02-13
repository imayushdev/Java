package Methods;

import java.util.Scanner;

public class studentGrade {
    String displayStudentGrade(String name,char Grade) {
        return name + " got "+ "grade " +  Grade;

    }

    public static void main(String[] args) {
        System.out.println("Enter your name ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter your grade");
        char grade= scanner.next().charAt(0);
           studentGrade object = new studentGrade();
          String output = object.displayStudentGrade(name,grade);
        System.out.println(output);
    }
}
