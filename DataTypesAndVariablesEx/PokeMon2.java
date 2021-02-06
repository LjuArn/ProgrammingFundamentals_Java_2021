package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class PokeMon2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int countTarget = 0;

        double halfPower = pokePowerN * 1.0 / 2;
        while (pokePowerN >= distanceM) {
            pokePowerN = pokePowerN - distanceM;
            countTarget++;

            if (halfPower == pokePowerN) {
                if (exhaustionFactorY > 0) {
                    pokePowerN = pokePowerN / exhaustionFactorY;
                }
            }
        }

        System.out.println(pokePowerN);
        System.out.println(countTarget);
    }
}
