package hexlet.code.games;

public class Progression {

    private static String[] generateTask() {
        int length = Engine.randomNumber(5, 10);
        int firstTerm = Engine.randomNumber(0, 20);
        int difference = Engine.randomNumber(0, 10);
        int hiddenIndex = Engine.randomNumber(0, length - 1);

        StringBuilder progression = new StringBuilder();

        int hiddenValue = 0;

        for (int i = 0; i < length; i++) {
            int currentTerm = firstTerm + i * difference;
            if (i == hiddenIndex) {
                progression.append(".. ");
                hiddenValue = currentTerm;
            } else {
                progression.append(currentTerm).append(" ");
            }
        }
        return new String[]{String.valueOf(progression), String.valueOf(hiddenValue)};
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
