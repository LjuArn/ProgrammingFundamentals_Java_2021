package FundamentalsJava.DataTypesAndVariablesMoreEx;

import java.util.Scanner;

public class DecryptingMessages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfLines; i++) {
            String line = scanner.nextLine();
            char symbol = line.charAt(0);
            int newSymbol = symbol + key;
            System.out.print((char)newSymbol);
        }

    }
}
