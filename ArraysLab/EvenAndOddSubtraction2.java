package FundamentalsJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String [] strArr = line.split(" ");
        int [] intArr = Arrays.stream(strArr)
                .mapToInt(e-> Integer.parseInt(e)).toArray();
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <intArr.length ; i++) {

            if(intArr[i]  % 2 ==0){
                sumEven += intArr[i];
            }else{
                sumOdd += intArr[i];
            }

        }
        System.out.println(sumEven - sumOdd);
    }
}
