package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit\n" +
                "Your choice: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> Cli.greeting();
            case 2 -> Game.even();
            case 0 -> System.out.println("Goodbuy");
        }

    }
}
