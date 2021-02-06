package FundamentalsJava.DataTypesAndVariablesEx;

import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//the number of people n and the capacity p of the elevator.
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        int course = numberOfPeople / capacityOfElevator;
        int others = numberOfPeople % capacityOfElevator;


        if (numberOfPeople < capacityOfElevator) {
            System.out.printf("All the persons fit inside in the elevator.\n" +
                    "Only one course is needed.");
        }else if (others > 0) {
            System.out.printf("%d courses * %d people" + " + 1 course * %d persons", course, capacityOfElevator, others);
        } else if (others == 0) {
            System.out.printf("%d courses * %d people", course, capacityOfElevator);
        }


    }
}
