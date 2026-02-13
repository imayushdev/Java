package InputOutputPractice;

import java.util.Scanner;

public class YtNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word");
        String First_word= scanner.nextLine();
        System.out.println("Enter the second word");
        String Second_word= scanner.nextLine();
        System.out.println("The name of your yt channel could be: "+ First_word+Second_word);
    }
}
