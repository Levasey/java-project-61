package hexlet.code.games;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS_COUNT = 3;
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 0;

    public static void run(String rules, String[][] gameData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String question = gameData[i][0];
            String correctAnswer = gameData[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
