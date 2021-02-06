package FundamentalsJava.DataTypesAndVariablesLab;

import java.util.Scanner;

public class bonusZad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String line = scanner.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char current = line.charAt(i);
            if (Character.isDigit(current)) {
                sum = sum + current - 48;
                System.out.print(current);
            }
        }
        System.out.printf("%nsum %d", sum);
    }
}
