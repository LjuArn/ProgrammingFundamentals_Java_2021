package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsLab;

import java.util.Scanner;

public class TheatrePromotion3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;

        switch (day) {
            case "weekday":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)){
                    price = 12;
                } else if (18 < age && age <= 64) {
                    price = 18;
                }
                break;
            case "weekend":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)){
                    price = 15;
                } else if (18 < age && age <= 64) {
                    price = 20;
                }
                break;
            case "holiday":
                if (0 <= age && age <= 18) {
                    price = 5;
                } else if (18 < age && age <= 64) {
                    price = 12;
                } else if (64 < age && age <= 122) {
                    price = 10;
                }
                break;
            default:
                System.out.println("Error!");
                break;
        }

        if (price == 0){
            System.out.println("Error!");
        }else {
            System.out.printf("%d$", price);
        }


    }
}
