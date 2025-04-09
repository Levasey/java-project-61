package hexlet.code;

import java.util.Scanner;

public class Prime {
    public static void prime() {
        Game game = new Game();
        game.greeting();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int roundsCount = 3;
        while (roundsCount > 0) {
            int number = (int) ((Math.random() * 100) + 1);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().toLowerCase();
            boolean isPrime = true;
            if (number <= 1) isPrime = false;
            if (number % 2 == 0) isPrime = false;
            for (int i = 3; i * i <= number; i += 2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            String correctAnswer = isPrime ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                roundsCount--;
            } else {
                game.badAnswer(answer, correctAnswer);
                return;
            }
        }
        game.congratulations();
    }
}
