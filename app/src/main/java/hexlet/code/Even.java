package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void even() {
        Game game = new Game();
        game.greeting();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int roundsCount = 3;
        while (roundsCount > 0) {
            int number = (int) (Math.random() * 100) + 1;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().toLowerCase();

            boolean isEven = number % 2 == 0;
            String correctAnswer = isEven ? "yes" : "no";

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
