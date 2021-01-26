package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsLab;

import java.util.Scanner;

public class TheatrePromotion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String day = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());

        switch (day) {
            case "weekday":
                if (0 <= age && age <= 18) {
                    System.out.println("12$");
                } else if (18 < age && age <= 64) {
                    System.out.println("18$");
                } else if (64 < age && age <= 122) {
                    System.out.println("12$");
                }else {
                    System.out.println("Error!");
                }
                break;
            case "weekend":
                if (0 <= age && age <= 18) {
                    System.out.println("15$");
                } else if (18 < age && age <= 64) {
                    System.out.println("20$");
                } else if (64 < age && age <= 122) {
                    System.out.println("15$");
                }else {
                    System.out.println("Error!");
                }
                break;
            case "holiday":
                if (0 <= age && age <= 18) {
                    System.out.println("5$");
                } else if (18 < age && age <= 64) {
                    System.out.println("12$");
                } else if (64 < age && age <= 122) {
                    System.out.println("10$");
                } else {
                    System.out.println("Error!");
                }
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}
