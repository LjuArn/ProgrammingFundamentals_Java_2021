package FundamentalsJava.ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String[] strArr1 = firstLine.split(" ");


        String secondtLine = scanner.nextLine();
        String[] strArr2 = secondtLine.split(" ");

        for (int i = 0; i < strArr2.length; i++) {
            for (int j = 0; j < strArr1.length; j++) {
                if (strArr2[i].equals(strArr1[j])){
                    System.out.printf("%s ",strArr2[i]);
                }
            }

        }

    }
}
