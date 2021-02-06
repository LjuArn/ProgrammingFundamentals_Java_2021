package FundamentalsJava.DataTypesAndVariablesLab;

import java.util.Scanner;

public class LowerOrUpper {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char letter = scanner.nextLine().charAt(0);

        if (letter >= 65 && letter <= 90) {
            System.out.println("upper-case");
        }
        if (letter >= 97 && letter <= 122) {
            System.out.println("lower-case");
        }

    }
}
