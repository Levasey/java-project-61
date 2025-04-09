package hexlet.code;

import java.util.Scanner;

public class Calculate {
    public static void calc() {
        Game game = new Game();
        game.greeting();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");

        int roundsCount = 3;
        while (roundsCount > 0) {
            int number1 = (int) ((Math.random() * 100) + 1);
            int number2 = (int) ((Math.random() * 100) + 1);
            char[] operators = {'+', '-', '*'};
            char op = operators[(int) (Math.random() * operators.length)];
            int correctAnswer = 0;
            switch (op) {
                case '+' -> {
                    System.out.println("Question: " + number1 + " + " + number2);
                    correctAnswer = number1 + number2;
                }
                case '-' -> {
                    System.out.println("Question: " + number1 + " - " + number2);
                    correctAnswer = number1 - number2;
                }
                case '*' -> {
                    System.out.println("Question: " + number1 + " * " + number2);
                    correctAnswer = number1 * number2;
                }

            }
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer == correctAnswer) {
                System.out.println("Correct!");
                roundsCount--;
            } else {
                game.badAnswer(String.valueOf(answer), String.valueOf(correctAnswer));
                return;
            }
        }
        game.congratulations();
    }
}
