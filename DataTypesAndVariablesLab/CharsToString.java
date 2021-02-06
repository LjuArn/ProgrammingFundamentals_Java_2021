package FundamentalsJava.DataTypesAndVariablesLab;

import java.util.Scanner;

public class CharsToString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.nextLine();
        char caracter1 = text1.charAt(0);

        char caracter2 = scanner.nextLine().charAt(0);
        char caracter3 = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c",caracter1,caracter2, caracter3);

    }
}
