package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsLab;

import java.util.Scanner;

public class TheatrePromotion2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String day = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());

        if ("weekday".equals(day)) {
            if ((age >= 0 && age <= 18) || (64 < age && age <= 122)) {
                System.out.println("12$");
            } else if (18 < age && age <= 64) {
                System.out.println("18$");
            } else {
                System.out.println("Error!");
            }
        } else if ("weekend".equals(day)) {
            if ((age >= 0 && age <= 18) || (64 < age && age <= 122)) {
                System.out.println("15$");
            } else if (18 < age && age <= 64) {
                System.out.println("20$");
            } else {
                System.out.println("Error!");
            }
        } else if ("holiday".equals(day)) {
            if (age >= 0 && age <= 18) {
                System.out.println("5$");
            } else if (18 < age && age <= 64) {
                System.out.println("12$");
            } else if (64 < age && age <= 122) {
                System.out.println("10$");
            } else {
                System.out.println("Error!");
            }
        }

    }
}
