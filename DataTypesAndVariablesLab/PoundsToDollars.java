package FundamentalsJava.DataTypesAndVariablesLab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pound = Double.parseDouble(scanner.nextLine());
        double dolar = pound * 1.31;

        System.out.printf("%.3f", dolar);

    }

}
