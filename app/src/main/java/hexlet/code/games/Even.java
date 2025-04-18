package hexlet.code.games;

public class Even {
    private static String[] generateTask() {
        int number = Engine.randomNumber(0, 100);

        String question = String.valueOf(number);
        String answer = calculate(number);

        return new String[]{question, answer};
    }

    private static String calculate(int number) {
        boolean isEven = number % 2 == 0;
        return isEven ? "yes" : "no";
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
