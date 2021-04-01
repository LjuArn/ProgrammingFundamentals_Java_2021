package FundamentalsJava.ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] intArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int maxSeq = 0;
        int sequence = 1;
        int number = 0;
        for (int index = intArr.length - 1; index > 0; index--) {

            if (intArr[index - 1] == intArr[index]) {
                sequence++;
            }else {
                sequence = 1;
            }

            if (sequence >= maxSeq) {
                maxSeq = sequence;
                number = intArr[index -1];
            }
        }

        for (int i = 1; i <= maxSeq; i++) {
            System.out.printf("%d ", number);
        }
    }
}
