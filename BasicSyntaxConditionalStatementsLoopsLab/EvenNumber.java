package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsLab;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        while (Math.abs(number % 2) == 1){
            System.out.println("Please write an even number.");
            number = Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("The number is: %d", Math.abs(number));


        //if (Math.abs(number % 2) == 1){
          //  System.out.println("Please write an even number.");
       // }else if (Math.abs(number % 2) == 0){
        //    System.out.printf("The number is: %d", Math.abs(number));
        //}
    }
}
