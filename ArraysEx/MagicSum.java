package FundamentalsJava.ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] intArr = Arrays.stream(scanner.nextLine().split( " "))
                .mapToInt(e-> Integer.parseInt(e)).toArray();

        int givenNumberSum = Integer.parseInt(scanner.nextLine());
        for (int index = 0; index < intArr.length; index++) {
            for (int i = index + 1; i < intArr.length; i++) {

                if (intArr[index] + intArr[i] == givenNumberSum){
                    System.out.printf("%d %d%n",intArr[index], intArr[i]);
                }
            }
        }
    }
}
