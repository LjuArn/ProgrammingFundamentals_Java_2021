package FundamentalsJava.DataTypesAndVariablesMoreEx;

import java.util.Scanner;

public class RefactoringPrimeChecker {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int divisible = 2; divisible <= number; divisible++) {
            boolean isPrime = true;
            for (int divider = 2; divider < divisible; divider++) {
                if (divisible % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", divisible, isPrime);
        }





    }
}
