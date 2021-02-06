package FundamentalsJava.DataTypesAndVariablesLab;

import java.util.Scanner;

public class ReversedChars1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char caracter1 = scanner.nextLine().charAt(0);
        char caracter2 = scanner.nextLine().charAt(0);
        char caracter3 = scanner.nextLine().charAt(0);

      //  System.out.println(caracter3 + " " + caracter2 + " " + caracter1);
        // или
        System.out.printf("%c %c %c", caracter3, caracter2, caracter1);
    }
}
