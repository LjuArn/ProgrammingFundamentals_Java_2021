package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsEx;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double singlePrice = 0.0;

        String input = scanner.nextLine();
        while (!"Start".equals(input)) {

            double coins = Double.parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }


            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!"End".equals(product)) {
            if ("Nuts".equals(product)) {
                singlePrice = 2.0;
            } else if ("Water".equals(product)) {
                singlePrice = 0.7;
            } else if ("Crisps".equals(product)) {
                singlePrice = 1.5;
            } else if ("Soda".equals(product)) {
                singlePrice = 0.8;
            } else if ("Coke".equals(product)) {
                singlePrice = 1.0;
            } else {
                System.out.println("Invalid product");
            }
            if (sum == 0) {
                break;
            } else if (sum >= singlePrice) {
                sum -= singlePrice;
                System.out.printf("Purchased %s%n", product);
            } else {
                System.out.println("Sorry, not enough money");
            }
            product = scanner.nextLine();
        }


        System.out.printf("Change: %.2f", sum);

    }
}
