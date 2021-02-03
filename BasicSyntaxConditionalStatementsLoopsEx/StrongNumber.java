package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsEx;

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int facturel = 1;
        int sum = 0;
        String number = scanner.nextLine();

        for (int i = 0; i < number.length(); i++) {

            char first = number.charAt(i);
            int firstNumber = Character.getNumericValue(first);

            if (firstNumber == 0) {
                facturel = 1;
            } else {
                for (int j = 1; j <= firstNumber; j++) {
                    facturel *= j;
                }
            }
            sum += facturel;
            facturel = 1;
        }

        int newNumber = Integer.parseInt(number);

        if (newNumber == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
