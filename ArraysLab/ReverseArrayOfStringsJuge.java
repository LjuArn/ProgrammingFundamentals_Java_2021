package FundamentalsJava.Arrays;

import java.util.Scanner;

public class ReverseArrayOfStringsJuge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String [] arrStr = line.split(" ");


        for (int i = 0; i < arrStr.length /2 ; i++) {
            String temp = arrStr [i];
            arrStr [i] = arrStr [arrStr.length - i - 1];
            arrStr [ arrStr.length - i - 1] = temp;
        }
        System.out.println(String.join(" ", arrStr));
    }
}
