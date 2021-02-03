package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsEx;

import java.util.Scanner;

public class StrongNumber3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        int fact = 1;
        int sum = 0;

        while (number != 0) {
            int rem = number % 10;

            for (int i = 1; i <= rem ; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            number = number / 10;
            fact = 1;
        }

        if (sum == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
