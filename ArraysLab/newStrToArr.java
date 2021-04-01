package FundamentalsJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class newStrToArr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String [] arrStr = line.split(" ");
        int [] intArr = Arrays.stream(arrStr)
                .mapToInt(e -> Integer.parseInt(e)).toArray();
    }
}
