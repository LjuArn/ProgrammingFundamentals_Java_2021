package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsLab;

import java.util.Scanner;

public class MultiplicationTable2doWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplaier = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", number, multiplaier, number * multiplaier);
            multiplaier++;
        } while (multiplaier <= 10);
    }
}
