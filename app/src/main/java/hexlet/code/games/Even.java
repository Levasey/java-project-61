package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static String[] generateTask() {
        int number = Utils.randomNumber(Utils.MIN_NUMBER, Utils.MAX_NUMBER);

        String question = String.valueOf(number);
        boolean isEven = isEven(number);
        String answer = answer(isEven);

        return new String[]{question, answer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String answer(boolean value) {
        return value ? "yes" : "no";
    }

    private static String[][] prepareGameData() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            gameData[i] = generateTask();
        }
        return gameData;
    }

    public static void launch() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameData = prepareGameData();
        Engine.run(rules, gameData);
    }
}
