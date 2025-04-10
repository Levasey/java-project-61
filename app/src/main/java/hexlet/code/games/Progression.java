package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        Game game = new Game();
        game.greeting();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");

        int roundsCount = 3;
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
