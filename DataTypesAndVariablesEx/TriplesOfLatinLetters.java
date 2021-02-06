package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class TriplesOfLatinLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int letter = Integer.parseInt(scanner.nextLine());

        for (int symbol1 = 'a'; symbol1 < 'a' + letter ; symbol1++) {
            for (int symbol2 = 'a'; symbol2 < 'a' + letter; symbol2++) {
                for (int symbol3 = 'a'; symbol3 < 'a' + letter; symbol3++) {
                    System.out.printf("%c%c%c%n", symbol1, symbol2, symbol3);
                }
            }
        }

    }
}
