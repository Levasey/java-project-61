package hexlet.code;

import java.util.Scanner;

public class Game {

    private String userName;

    public void setUserName() {
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
    }

    public void congratulations() {
        System.out.println("Congratulations, " + userName + "!");
    }

    public void badAnswer(String yourAnswer, String correctAnswer) {
        System.out.println("'" + yourAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    public void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setUserName();
        System.out.println("Hello, " + userName);
    }
}
