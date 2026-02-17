package Projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    static int CHOICE;
    static int num;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do {

            int attempt = 0, choice, num = 0;
            Random random = new Random();
            int secretNum = random.nextInt(100) + 1;

            do {
                System.out.println("Choose Difficulty level");
                System.out.println("press 1 for Easy");
                System.out.println("Press 2 for medium");
                System.out.println("Press 3 for hard !");

                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> attempt = 10;
                    case 2 -> attempt = 7;
                    case 3 -> attempt = 5;
                    default -> System.out.println("Please insert valid choice");

                }
            } while (choice != 1 && choice != 2 && choice != 3);

            do {
                if (secretNum == num || attempt < 1) {
                    System.out.println("You lost\n");
                    break;
                }
                System.out.println("Enter the number between 1 to 100");

                num = scanner.nextInt();
                if (num > 0 && num < 101) {
                    if (num < secretNum) {
                        System.out.println("Too Low");
                    } else if (num == secretNum) {
                        System.out.println("Congrats!! you win");
                    } else {
                        System.out.println("Too High");
                    }
                }
                if (num < 1 || num > 100) {
                    System.out.println("Please enter number in Range");
                } else {
                    attempt = attempt - 1;
                }
                System.out.println("Remaining attempts : " + attempt);
            } while (!(secretNum == num || attempt == 0));
            if (num != secretNum && attempt == 0) {
                System.out.println("You Lost !!");

                do {
                    System.out.println("Press 1 to  play Again! ");
                    System.out.println("Press Zero to exit");
                    CHOICE = scanner.nextInt();
                } while (CHOICE != 1 && CHOICE != 0);


            }

    }while(CHOICE==1);

        System.out.println("Game Ended");
    }
}
