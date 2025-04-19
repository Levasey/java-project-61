package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static String[] generateTask() {
        int number = Utils.randomNumber(Utils.MIN_NUMBER, Utils.MAX_NUMBER);

        String question = String.valueOf(number);
        boolean isPrime = isPrime(number);
        String answer = Utils.answer(isPrime);

        return new String[]{question, answer};
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String[][] prepareGameData() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            gameData[i] = generateTask();
        }
        return gameData;
    }

    public static void launch() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] gameData = prepareGameData();
        Engine.run(rules, gameData);
    }
}
