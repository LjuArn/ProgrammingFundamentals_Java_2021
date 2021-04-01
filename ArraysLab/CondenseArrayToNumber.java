package FundamentalsJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        while (arr.length > 1) {
            int[] condense = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                condense[i] = arr[i] + arr[i + 1];
            }
             arr = condense;
        }

        System.out.println(arr[0]);
    }
}
