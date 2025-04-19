package hexlet.code.games;

public class Prime {

    private static String[] generateTask() {
        int number = Engine.randomNumber(0, 100);

        String question = String.valueOf(number);
        String answer = calculate(number);

        return new String[]{question, answer};
    }

    private static String calculate(int number) {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        }
        if (number % 2 == 0) {
            isPrime = false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime ? "yes" : "no";
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
