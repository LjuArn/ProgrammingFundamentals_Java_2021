package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsEx;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String typeOfGrup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double priceForPerson = 0.0;
        double totalPrice = 0.0;

        if ("Students".equals(typeOfGrup)) {
            if ("Friday".equals(dayOfTheWeek)) {
                priceForPerson = 8.45;
            } else if ("Saturday".equals(dayOfTheWeek)) {
                priceForPerson = 9.80;
            } else if ("Sunday".equals(dayOfTheWeek)) {
                priceForPerson = 10.46;
            }

            if(number >= 30){
                totalPrice = number * priceForPerson * 0.85;
            }else{
                totalPrice = number * priceForPerson;
            }

        } else if ("Business".equals(typeOfGrup)) {
            if ("Friday".equals(dayOfTheWeek)) {
                priceForPerson = 10.90;
            } else if ("Saturday".equals(dayOfTheWeek)) {
                priceForPerson = 15.60;
            } else if ("Sunday".equals(dayOfTheWeek)) {
                priceForPerson = 16.00;
            }

            if(number >= 100){
                totalPrice = (number - 10) * priceForPerson;
            }else{
                totalPrice = number * priceForPerson;
            }

        } else if ("Regular".equals(typeOfGrup)) {
            if ("Friday".equals(dayOfTheWeek)) {
                priceForPerson = 15.00;
            } else if ("Saturday".equals(dayOfTheWeek)) {
                priceForPerson = 20.00;
            } else if ("Sunday".equals(dayOfTheWeek)) {
                priceForPerson = 22.50;
            }

            if(number >= 10 && number <= 20){
                totalPrice = number * priceForPerson * 0.95;
            }else{
                totalPrice = number * priceForPerson;
            }

        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
