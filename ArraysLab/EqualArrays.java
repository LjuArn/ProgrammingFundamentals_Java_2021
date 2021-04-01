package FundamentalsJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String[] strArr1 = firstLine.split(" ");
        int[] intArr1 = Arrays.stream(strArr1)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        String secondLine = scanner.nextLine();
        String[] strArr2 = secondLine.split(" ");
        int[] intArr2 = Arrays.stream(strArr2)
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        boolean sumYes = true;
        for (int i = 0; i < intArr1.length; i++) {

            if (intArr1[i] == intArr2[i]) {
                sum += intArr1[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                sumYes = false;
                break;
            }

        }

        if (sumYes){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
