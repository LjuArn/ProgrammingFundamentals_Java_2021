package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class Snowballs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;
        double snowballValueMax = 0;
        int snowballSnowMax = 0;
        int snowballTimeMax = 0;
        int snowballQualityMax = 0;

        for (int i = 1; i <= numberOfSnowballs; i++) {
            snowballSnow = Integer.parseInt(scanner.nextLine());
            snowballTime = Integer.parseInt(scanner.nextLine());
            snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow * 1.0/ snowballTime), snowballQuality);
            if (snowballValue > snowballValueMax){
                snowballValueMax = snowballValue;
                snowballSnowMax = snowballSnow;
                snowballTimeMax = snowballTime;
                snowballQualityMax = snowballQuality;
            }
        }


        System.out.printf("%d : %d = %.0f (%d)", snowballSnowMax, snowballTimeMax, snowballValueMax, snowballQualityMax);
    }
}
