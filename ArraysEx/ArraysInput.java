package FundamentalsJava.ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInput {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input

        String[] sentance = scanner.nextLine().split("\\s+");

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        double[] numDouble = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();


        //output

        System.out.println(String.join(" ", sentance));

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (double numberDoub : numDouble) {
            System.out.print(numberDoub + " ");
        }


    }
}
