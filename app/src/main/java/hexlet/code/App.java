package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> Cli.greeting();
            case 2 -> Even.launch();
            case 3 -> Calculate.launch();
            case 4 -> Gcd.launch();
            case 5 -> Progression.launch();
            case 6 -> Prime.launch();
            case 0 -> System.out.println("Goodbye");
        }
    }
}
