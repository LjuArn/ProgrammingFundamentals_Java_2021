package FundamentalsJava.DataTypesAndVariablesLab;

import java.util.Scanner;

public class ConcatNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//ead two names and a delimiter.
// Print the names joined by the delimiter(разделител).

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(name1 + delimiter + name2);

    }
}
