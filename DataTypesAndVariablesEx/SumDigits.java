package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class SumDigits {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int singleInt = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (singleInt > 0) {
            int newDigit = singleInt % 10;
            sum += newDigit;
            singleInt = singleInt / 10;
        }
        System.out.println(sum);
    }
}