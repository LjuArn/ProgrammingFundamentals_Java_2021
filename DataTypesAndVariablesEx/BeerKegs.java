package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class BeerKegs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double maxVolume = Double.MIN_VALUE;
        String maxKegModel = "";

        int numberOfKegs = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfKegs ; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius * radius * height;

            if (volume > maxVolume){
                maxVolume = volume;
                maxKegModel = model;
            }
        }

        System.out.printf("%s", maxKegModel);
    }
}
