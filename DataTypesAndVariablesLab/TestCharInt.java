package FundamentalsJava.DataTypesAndVariablesLab;

import java.util.Scanner;

public class TestCharInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (char i = 'A'; i <= 'Z' ; i++) {
            System.out.printf("Caracter is '%c' digit %d%n", i, (int) i);
        }


        for (char i = 'А'; i <= 'Я' ; i++) {
            System.out.printf("Caracter is '%c' digit %d%n", i, (int) i);
        }

    }
}
