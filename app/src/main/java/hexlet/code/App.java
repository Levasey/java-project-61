package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greeting;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "0 - Exit\n" +
                "Your choice: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> greeting();
            case 2 -> Game.even();
            case 3 -> Game.calc();
            case 4 -> Game.gcd();
            case 0 -> System.out.println("Goodbuy");
        }

    }
}
