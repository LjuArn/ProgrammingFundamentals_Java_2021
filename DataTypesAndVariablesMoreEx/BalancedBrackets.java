package FundamentalsJava.DataTypesAndVariablesMoreEx;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int numberOflines = Integer.parseInt(scanner.nextLine());
        boolean openingBracket = false;
        boolean closingBracket = false;
        boolean balans = false;
        int countOpenBracket = 0;
        int countClosedBracket = 0;
        for (int i = 1; i <= numberOflines; i++) {
            String input = scanner.nextLine();

            if ("(".equals(input)) {
                openingBracket = true;
                countOpenBracket++;
                if (countOpenBracket == 2) {
                    openingBracket = false;
                }
            }
            if (")".equals(input)) {
                closingBracket = true;
                countClosedBracket++;
                if (countClosedBracket == 2) {
                    closingBracket = false;
                }
            }
            if (openingBracket && closingBracket == true) {
                balans = true;
            }else {
                balans = false;
            }

        }
        if (balans) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}


