package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsEx;

import java.util.Scanner;

public class Division2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int dev = 0;

        if (number % 2 == 0) {
            dev = 2;
        }
        if (number % 3 == 0) {
            dev = 3;
        }
        if (number % 6 == 0) {
            dev = 6;
        }
        if (number % 7 == 0) {
            dev = 7;
        }
        if (number % 10 == 0) {
            dev = 10;
        }

        if (dev == 0) {
            System.out.println("Not divisible");
        }else {
            System.out.printf("The number is divisible by %d", dev);
        }
        //You will be given an integer and you have to print on the console
        // whether that number is divisible by the following numbers: 2, 3, 6, 7, 10.
        // You should always take the bigger division.
        // If the number is divisible by both 2 and 3 it is also divisible by 6 and
        // you should print only the division by 6.
        // If a number is divisible by 2 it is sometimes also divisible by 10 and
        // you should print the division by 10. If the number is not divisible by
        // any of the given numbers print “”.
        // Otherwise print "The number is divisible by {number}".
    }
}
