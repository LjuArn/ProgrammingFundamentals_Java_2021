package FundamentalsJava.ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean findNumber = false;
        if (intArr.length == 1) {
            System.out.println(0);
        } else {
            int currentInd = 0;
            for (int index = 0; index < intArr.length; index++) {
                currentInd = index;
                int sumLeft = 0;
                int sumRight = 0;

                for (int i = 0; i < index; i++) {
                    sumLeft += intArr[i];
                }
                for (int i = index + 1; i < intArr.length; i++) {
                    sumRight += intArr[i];
                }
                if (sumRight == sumLeft) {
                    findNumber = true;
                    break;
                } else {
                    findNumber = false;
                }
            }
            if (findNumber) {
                System.out.println(currentInd);
            } else {
                System.out.println("no");
            }
        }

    }
}
