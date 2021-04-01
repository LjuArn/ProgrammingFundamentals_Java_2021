package FundamentalsJava.ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeField = Integer.parseInt(scanner.nextLine());
        int[] field = new int[sizeField];

        int[] ladyBugsIndex = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int ladyBugsInd : ladyBugsIndex) {
            if (ladyBugsInd >= 0 && ladyBugsInd <= field.length - 1) {
                field[ladyBugsInd] = 1;
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            //"{ladybug index} {direction} {fly length}"
            String[] arrComand = command.split(" ");

            int index = Integer.parseInt(arrComand[0]);
            String direction = arrComand[1];
            int flyLength = Integer.parseInt(arrComand[2]);

            if (index >= 0 && index <= field.length - 1 && field[index] == 1) {
                field[index] = 0;

                if (direction.equals("right")) {
                    index += flyLength;
                }
                while (index <= field.length - 1 && field[index] == 1) {
                    index += flyLength;
                }
                if (index <= field.length - 1) {
                    field[index] = 1;
                }

                if (direction.equals("left")) {
                    index -= flyLength;
                }

                while (index >= 0 && field[index] == 1) {
                    index -= flyLength;
                }
                if (index >= 0) {
                    field[index] = 1;
                }

            }


            command = scanner.nextLine();
        }

        System.out.println(1);
    }
}
