package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void even() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 3;
        Random random = new Random();
        while (count > 0) {
            int number = random.nextInt(100) + 1; // generates random number 1-100
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().toLowerCase();

            boolean isEven = number % 2 == 0;
            String correctAnswer = isEven ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                count--;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        if (count == 0) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
