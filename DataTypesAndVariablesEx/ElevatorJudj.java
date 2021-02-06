package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class ElevatorJudj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        double course = Math.ceil (numberOfPeople * 1.0/ capacityOfElevator);

        System.out.printf("%.0f", course);

    }
}
