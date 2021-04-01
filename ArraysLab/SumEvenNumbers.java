package FundamentalsJava.Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbersOnLine = scanner.nextLine();

        String[] arr = numbersOnLine.split(" ");

        int[] newArr = Arrays.stream(arr).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = 0;
        for (int i = 0; i <newArr.length; i++) {
            if (newArr[i] % 2 == 0) {
                sum += newArr[i];
            }
        }

        System.out.println(sum);
    }
}
