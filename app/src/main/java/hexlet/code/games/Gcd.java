package hexlet.code.games;

import java.math.BigInteger;

public class Gcd {

    private static String[] generateTask() {
        int number1 = Engine.randomNumber(0, 100);
        int number2 = Engine.randomNumber(0, 100);

        String question = number1 + " " + number2;
        String answer = calculate(number1, number2);

        return new String[]{question, answer};
    }

    private static String calculate(int number1, int number2) {
        BigInteger big1 = BigInteger.valueOf(number1);
        BigInteger big2 = BigInteger.valueOf(number2);
        BigInteger gcd = big1.gcd(big2);
        return String.valueOf(gcd);
    }

    private static String[][] prepareGameData() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            gameData[i] = generateTask();
        }
        return gameData;
    }

    public static void launch() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] gameData = prepareGameData();
        Engine.run(rules, gameData);
    }
}
