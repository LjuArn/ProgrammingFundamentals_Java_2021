package FundamentalsJava.Arrays;

import java.util.Arrays;

public class SplitMethodParsToInt {

    public static void main(String[] args) {

        String inputLine = "1 34 5 345";
        String[] items = inputLine.split(" ");
        int[] arr = Arrays.stream(items)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

    }

}
