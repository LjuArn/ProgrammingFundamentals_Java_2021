package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class PokeMon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	The input consists of 3 lines.
//•	On the first line you will receive N – an integer.
//•	On the second line you will receive M – an integer.
//•	On the third line you will receive Y – an integer.

                int pokePowerN = Integer.parseInt(scanner.nextLine());
                int distanceM = Integer.parseInt(scanner.nextLine());
                int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
                int countTarget = 0;
                int originPokePowerN = pokePowerN;
                while (pokePowerN >= distanceM) {
                    pokePowerN = pokePowerN - distanceM;
                    countTarget++;

                    if (pokePowerN == originPokePowerN / 2) {
                        if (exhaustionFactorY > 0) {
                            pokePowerN = pokePowerN / exhaustionFactorY;
                        }
                    }
                }

                System.out.println(pokePowerN);
                System.out.println(countTarget);

    }
}
