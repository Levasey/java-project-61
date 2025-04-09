package hexlet.code;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private static int roundsCount = 3;
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

        while (roundsCount > 0) {
            int number = (int) (Math.random() * 100) + 1; // generates random number 1-100
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

    public static void calc() {
        Game game = new Game();
        game.greeting();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");

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

    public static void gcd() {
        Game game = new Game();
        game.greeting();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        while (roundsCount > 0) {
            int number1 = (int) ((Math.random() * 100) + 1);
            int number2 = (int) ((Math.random() * 100) + 1);
            System.out.println("Question: " + number1 + " " + number2);

            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            BigInteger big1 = BigInteger.valueOf(number1);
            BigInteger big2 = BigInteger.valueOf(number2);
            BigInteger gcd = big1.gcd(big2);
            int correct = Integer.parseInt(String.valueOf(gcd));

            if (correct == answer) {
                System.out.println("Correct!");
                roundsCount--;
            } else {
                game.badAnswer(String.valueOf(answer), String.valueOf(correct));
                return;
            }
        }
        game.congratulations();
    }

    public static void progression() {
        Game game = new Game();
        game.greeting();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");

        while (roundsCount > 0) {
            Random random = new Random();
            int length = 5 + random.nextInt(6);
            int firstTerm = 1 + random.nextInt(20);
            int difference = 1 + random.nextInt(10);

            int[] progression = new int[length];
            for (int i = 0; i < length; i++) {
                progression[i] = firstTerm + i * difference;
            }

            int hiddenIndex = random.nextInt(length);
            int hiddenValue = progression[hiddenIndex];
            progression[hiddenIndex] = -1;
            System.out.print("Question: ");
            for (int num : progression) {
                if (num == -1) {
                    System.out.print(".. ");
                } else {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            if (hiddenValue == answer) {
                System.out.println("Correct!");
                roundsCount--;
            } else {
                game.badAnswer(String.valueOf(answer), String.valueOf(hiddenValue));
                return;
            }
        }
        game.congratulations();
    }
}
