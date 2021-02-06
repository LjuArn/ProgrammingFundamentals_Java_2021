package FundamentalsJava.DataTypesAndVariablesLab;

import java.util.Scanner;

public class bonusZad {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char current = line.charAt(i);
            if (Character.isDigit(current)) {
                System.out.print(current);
            } //if(!Character.isDigit(current)){
               //System.out.print(current);
           // } if (Character.isAlphabetic(current)){
               // System.out.print(current);
           // }

        }
    }
}
