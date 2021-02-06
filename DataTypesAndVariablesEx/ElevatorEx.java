package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class ElevatorEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        int course = (int) Math.ceil (numberOfPeople * 1.0/ capacityOfElevator);

        System.out.printf("%d", course);
    }
}
