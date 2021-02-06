package FundamentalsJava.DataTypesAndVariablesMoreEx;

import java.util.Scanner;

public class DataTypeFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isDigit = false;

        while (!"END".equals(input)) {

            if (input.length() == 1 && !Character.isDigit(input.charAt(0))) {
                System.out.printf("%s is character type%n", input);
            } else if (input.length() == 1 && Character.isDigit(input.charAt(0))) {
                System.out.printf("%s is integer type%n", input);
            } else if ("true".equals(input) || "false".equals(input)) {
                System.out.printf("%s is boolean type%n", input);
            } else if (input.length() > 1 && Character.isDigit(input.charAt(0))) {

                for (int i = 0; i <= input.length() - 1; i++) {
                    char current = input.charAt(i);

                    if (current == 46) {
                        isDigit = true;
                    }
                }

                if (isDigit) {
                    System.out.printf("%s is floating point type%n", input);
                } else {
                    System.out.printf("%s is integer type%n", input);
                }

            } else if (input.length() > 1 && !Character.isDigit(input.charAt(0))) {
                System.out.printf("%s is string type%n", input);
            }

            input = scanner.nextLine();

        }
    }
}


//if (input.length() == 1 && Character.isDigit(input.charAt(0)))