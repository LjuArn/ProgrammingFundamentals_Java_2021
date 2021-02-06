package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class SumOfChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;

        for (int i = 0; i < number; i++) {

            char current = scanner.nextLine().charAt(0);
            totalSum = totalSum + current;
        }

        System.out.printf("The sum equals: %d", totalSum);

    }
}
