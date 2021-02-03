package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsEx;

import java.util.Scanner;

public class RageExpenses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());


        //Every second lost game, Pesho trashes his headset.
        //Every third lost game, Pesho trashes his mouse.
        //When Pesho trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
        //Every second time, when he trashes his keyboard, he also trashes his display.

        int countHeadset = lostGamesCount / 2;
        int countMouse = lostGamesCount / 3;
        int countKayboard = lostGamesCount /6;
        int countDisplay = countKayboard / 2;

        double expenses = countHeadset * priceHeadset + countMouse * priceMouse + countKayboard * priceKeyboard + countDisplay * priceDisplay;

        System.out.printf("Rage expenses: %.2f lv.", expenses);

    }
}
