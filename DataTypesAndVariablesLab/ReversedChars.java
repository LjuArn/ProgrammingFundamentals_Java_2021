package FundamentalsJava.DataTypesAndVariablesLab;

import java.util.Scanner;

public class ReversedChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char first = text.charAt(0);

        String text2 = scanner.nextLine();
        char second = text2.charAt(0);

        String text3 = scanner.nextLine();
        char third = text3.charAt(0);

      //  System.out.println(third + " " + second + " " + first);

        //или

        System.out.printf("%c %c %c", third, second, first);

    }
}
