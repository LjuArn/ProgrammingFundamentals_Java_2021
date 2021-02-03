package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsMoreEx;

import java.util.Scanner;

public class Messages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {

            String digit = scanner.nextLine();
            int lenghtD = digit.length();
            char symbol = digit.charAt(0);
            int mainDigit = Character.getNumericValue(symbol);

            int offcet = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9) {
                offcet++;
            }
            int letterIndex = (offcet + lenghtD - 1) + 97;
            char letter = (char)letterIndex;
            if("0".equals(digit)) {
                System.out.print(" ");
            } else {
                System.out.print(letter);
            }

        }

    }

}
