package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class SpiceMustFlow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int crewConsumption = 26;
        int count = 0;
        int storige = 0;
        int hold = 0;

        int startingYield = Integer.parseInt(scanner.nextLine());

        if (startingYield >= 100) {
            while (startingYield >= 100) {
                hold = startingYield - crewConsumption;
                storige += hold;
                startingYield -= 10;
                count++;
            }
            storige -= crewConsumption;

        }

        System.out.println(count);
        System.out.println(storige);

    }
}
