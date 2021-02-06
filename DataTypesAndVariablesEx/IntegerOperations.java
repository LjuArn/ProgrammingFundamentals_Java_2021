package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class IntegerOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit1 = Integer.parseInt(scanner.nextLine());
        int digit2 = Integer.parseInt(scanner.nextLine());
        int digit3 = Integer.parseInt(scanner.nextLine());
        int digit4 = Integer.parseInt(scanner.nextLine());

        long result = (digit1 + digit2) / digit3 * digit4;
        System.out.println(result);

    }
}
