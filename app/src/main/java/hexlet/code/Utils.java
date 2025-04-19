package hexlet.code;

public class Utils {
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 0;

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int[] generateProgression(int firstTerm, int difference, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = firstTerm + i * difference;
        }
        return progression;
    }

    public static String answer(boolean value) {
        return value ? "yes" : "no";
    }
}
