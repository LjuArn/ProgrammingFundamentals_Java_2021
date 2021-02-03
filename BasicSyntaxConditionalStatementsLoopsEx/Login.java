package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsEx;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        boolean bloc = false;
        StringBuilder passwordBuild = new StringBuilder();

        String username = scanner.nextLine();

        for (int i = username.length() - 1; i >= 0; i--) {
            char curentPosition = username.charAt(i);
            passwordBuild.append(curentPosition);
        }
        String password = passwordBuild.toString();
        String command = scanner.nextLine();

        while (!password.equals(command)) {
            count++;
            if (count > 3) {
                bloc = true;
                break;
            }

            System.out.println("Incorrect password. Try again.");
            command = scanner.nextLine();
        }


        if (bloc) {
            System.out.printf("User %s blocked!", username);
        } else {
            System.out.printf("User %s logged in.", username);
        }

//You will be given a string representing a username.
// The password will be that username reversed.
// Until you receive the correct password print
// on the console "Incorrect password. Try again.".
// When you receive the correct password print "User {username} logged in."
// However on the fourth try if the password is still not
// correct print "User {username} blocked!" and end the program.


    }
}
