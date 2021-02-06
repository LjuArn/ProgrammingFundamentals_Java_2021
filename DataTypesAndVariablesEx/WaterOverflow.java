package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class WaterOverflow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tank = 255;

        int numberOfLine = Integer.parseInt(scanner.nextLine());
        int sumLitters = 0;
        for (int i = 1; i <= numberOfLine; i++) {
            int litersOfwater = Integer.parseInt(scanner.nextLine());

            if (litersOfwater > (tank - sumLitters)) {
                System.out.println("Insufficient capacity!");
            } else {
                sumLitters += litersOfwater;
            }
        }
        System.out.println(sumLitters);

    }
}
