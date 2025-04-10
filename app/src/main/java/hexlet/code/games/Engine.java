package hexlet.code.games;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS_COUNT = 3;

    public static void run(String rules, String[][] gameData) {
        Game game = new Game();
        game.greeting();
        System.out.println(rules);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String question = gameData[i][0];
            String correctAnswer = gameData[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().trim();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                game.badAnswer(answer, correctAnswer);
                return;
            }
        }
        game.congratulations();
    }

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
