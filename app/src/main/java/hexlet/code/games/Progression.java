package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static String[] generateTask() {
        int minLength = 5;
        int maxLength = 10;
        int diff = 10;

        int length = Utils.randomNumber(minLength, maxLength);
        int firstTerm = Utils.randomNumber(Utils.MIN_NUMBER, Utils.MAX_NUMBER);
        int difference = Utils.randomNumber(Utils.MIN_NUMBER, diff);
        int hiddenIndex = Utils.randomNumber(Utils.MIN_NUMBER, length - 1);

        int[] progression = Utils.generateProgression(firstTerm, difference, length);
        int hiddenValue = progression[hiddenIndex];

        String[] progressionWithHiddenIndex = new String[length];
        for (int i = 0; i < length; i++) {
            progressionWithHiddenIndex[i] = (i == hiddenIndex) ? ".." : String.valueOf(progression[i]);
        }
        return new String[]{
                String.join(" ", progressionWithHiddenIndex),
                String.valueOf(hiddenValue)
        };
    }

    private static String[][] prepareGameData() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            gameData[i] = generateTask();
        }
        return gameData;
    }

    public static void launch() {
        String rules = "What number is missing in the progression?";
        String[][] gameData = prepareGameData();
        Engine.run(rules, gameData);
    }
}
