package FundamentalsJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] arrStr = line.split(" ");

        int[] numbers = Arrays.stream(arrStr).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 ==0){
                sumEven += numbers[i];
            }else{
                sumOdd += numbers[i];
            }

        }

        System.out.println(sumEven - sumOdd);
    }
}
