package hexlet.code;

public class Utils {
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 0;

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
