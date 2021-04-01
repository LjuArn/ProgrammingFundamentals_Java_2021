package FundamentalsJava.Arrays;

public class SplitMethod {


    public static void main(String[] args) {

        String numbersOnOneLine = "1 12 27 4";

        String [] splittedString = numbersOnOneLine.split(" ");
        int [] arr = new int[splittedString.length];

        for (int i = 0; i < splittedString.length; i++) {
            arr[i] = Integer.parseInt(splittedString[i]);
        }
    }
}
