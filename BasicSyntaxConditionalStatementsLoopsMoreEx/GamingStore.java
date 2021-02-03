package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsMoreEx;

import java.util.Scanner;

public class GamingStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0.0;
        double boughtGames = 0.0;
        boolean notFound = false;
        boolean totalSpend = true;
        while (!"Game Time".equals(input)) {

            if ("OutFall 4".equals(input)) {
                price = 39.99;
            } else if ("CS: OG".equals(input)) {
                price = 15.99;
            } else if ("Zplinter Zell".equals(input)) {
                price = 19.99;
            } else if ("Honored 2".equals(input)) {
                price = 59.99;
            } else if ("RoverWatch".equals(input)) {
                price = 29.99;
            } else if ("RoverWatch Origins Edition".equals(input)) {
                price = 39.99;
            } else {
                notFound = true;
            }

            if (notFound) {
                System.out.println("Not Found");
                notFound = false;
            } else {
                if (price > balance) {
                    System.out.println("Too Expensive");
                } else if (balance >= price) {
                    System.out.printf("Bought %s%n", input);
                    balance -= price;
                    boughtGames += price;
                }

            }
            if (balance == 0) {
                System.out.println("Out of money!");
                totalSpend = false;
                break;
            }

            input = scanner.nextLine();
        }

        if (totalSpend) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", boughtGames, balance);
        }
    }
}
