package hexlet.code.games;

public class Calculate {
    private static final char[] OPERATORS = {'+', '-', '*'};

    private static String[] generateTask() {
        int number1 = Engine.randomNumber(0, 100);
        int number2 = Engine.randomNumber(0, 100);
        char op = OPERATORS[Engine.randomNumber(0, OPERATORS.length - 1)];

        String question = number1 + " " + op + " " + number2;
        String answer = calculate(number1, number2, op);

        return new String[]{question, answer};
    }

    private static String calculate(int number1, int number2, char op) {
        return switch (op) {
            case '+' -> String.valueOf(number1 + number2);
            case '-' -> String.valueOf(number1 - number2);
            case '*' -> String.valueOf(number1 * number2);
            default -> throw new RuntimeException("Unknown operator: " + op);
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
        String rules = "What is the result of the expression?";
        String[][] gameData = prepareGameData();
        Engine.run(rules, gameData);
    }
}
