package hexlet.code.games;

import java.math.BigInteger;
import java.util.Scanner;

public class Gcd {
    public static void gcd() {
        Game game = new Game();
        game.greeting();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        int roundsCount = 3;
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
}
