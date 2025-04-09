package hexlet.code;

import java.util.Scanner;

public class Game {

    private static int ROUNDS_COUNT = 3;
    private String userName;

    public void setUserName() {
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
    }

    public void congratulations() {
        System.out.println("Congratulations, " + userName + "!");
    }

    public void badAnswer(String yourAnswer, String correctAnswer) {
        System.out.println("'" + yourAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }


    public void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setUserName();
        System.out.println("Hello, " + userName);
    }

    public static void even() {
        Game game = new Game();
        game.greeting();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (ROUNDS_COUNT > 0) {
            int number = (int) (Math.random() * 100) + 1; // generates random number 1-100
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().toLowerCase();

            boolean isEven = number % 2 == 0;
            String correctAnswer = isEven ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                ROUNDS_COUNT--;
            } else {
                game.badAnswer(answer, correctAnswer);
                return;
            }
        }
        game.congratulations();
    }

    public static void calc() {
        Game game = new Game();
        game.greeting();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");

        while (ROUNDS_COUNT > 0) {
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
                ROUNDS_COUNT--;
            } else {
                game.badAnswer(String.valueOf(answer), String.valueOf(correctAnswer));
                return;
            }
        }
        game.congratulations();
    }
}
