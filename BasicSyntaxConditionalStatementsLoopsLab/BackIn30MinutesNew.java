package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsLab;

import java.util.Scanner;

public class BackIn30MinutesNew {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());


        // The result should be in format "hh:mm".
        // The hours have one or two numbers and
        // the minutes have always two numbers (with leading zero).
        if (hours > 23 || minutes > 59) {
            System.out.println("Incorrect input");
        } else {

            minutes += 30;
            if (minutes > 59) {
                minutes -= 60;
                hours += 1;
            }
            if (hours > 23) {
                hours -= 24;
            }

            if (minutes <= 9 && hours <= 9) {
                System.out.printf("%02d:%02d", hours, minutes);
            } else if (minutes <= 9) {
                System.out.printf("%d:%02d", hours, minutes);
            } else if (hours <= 9) {
                System.out.printf("%02d:%d", hours, minutes);
            } else {
                System.out.printf("%d:%d", hours, minutes);
            }
        }
    }


}

