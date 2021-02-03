package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsEx;

import java.util.Scanner;

public class PrintAndSumMy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.printf("Sum: %d", sum);


    }
}
