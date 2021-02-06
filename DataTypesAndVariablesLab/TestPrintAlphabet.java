package FundamentalsJava.DataTypesAndVariablesLab;

import java.util.Scanner;

public class TestPrintAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (char i = 'A'; i <= 'z' ; i++) {
            System.out.println(i);
        }
    }
}
