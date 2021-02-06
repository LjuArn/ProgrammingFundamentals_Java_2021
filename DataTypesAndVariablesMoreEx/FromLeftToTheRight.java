package FundamentalsJava.DataTypesAndVariablesMoreEx;

import java.util.Scanner;

public class FromLeftToTheRight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int space = 0;
        StringBuilder firstNumber = new StringBuilder();
        StringBuilder secondNumber = new StringBuilder();
        String numbers = "";

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= lines; i++) {
            numbers = scanner.nextLine();
            for (int j = 0; j < numbers.length(); j++) {

                char current = numbers.charAt(j);

                if (current == 32) {
                    space = j;
                }
            }


            for (int k = 0; k < space; k++) {
                char currentFirstSymbol = numbers.charAt(k);
                firstNumber.append(currentFirstSymbol);
            }
            String numberOne = firstNumber.toString();
            long newOne = Long.parseLong(numberOne);

            for (int l = space + 1; l < numbers.length(); l++) {
                char currentFirstSymbol = numbers.charAt(l);
                secondNumber.append(currentFirstSymbol);
            }
            String numberTwo = secondNumber.toString();
            long newTwo = Long.parseLong(numberTwo);
            int sumOne = 0;
            int sumTwo = 0;
            if (newOne > newTwo) {
                while (newOne > 0) {
                    long lastNumber1 = newOne % 10;
                    sumOne += lastNumber1;
                    newOne = newOne / 10;
                }
                System.out.println(sumOne);
            } else {
                while (newTwo > 0) {
                    long lastNumber2 = newTwo % 10;
                    sumTwo += lastNumber2;
                    newTwo = newTwo / 10;
                }
                System.out.println(sumTwo);
            }
            firstNumber.setLength(0);
            secondNumber.setLength(0);

        }


    }
}
