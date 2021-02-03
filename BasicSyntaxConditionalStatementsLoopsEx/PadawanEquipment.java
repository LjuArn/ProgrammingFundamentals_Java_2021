package FundamentalsJava.BasicSyntaxConditionalStatementsLoopsEx;

import java.util.Scanner;

public class PadawanEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsaber = Double.parseDouble(scanner.nextLine());
        double priceOfRobe = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());

        double expenseOfLightsabers = Math.ceil(countOfStudents * 1.1) * priceOfLightsaber;

        int discount = countOfStudents / 6;
        double expenseOfBelt = (countOfStudents - discount) * priceOfBelt;

        double expense = expenseOfLightsabers + countOfStudents * priceOfRobe + expenseOfBelt;

        if (expense <= money){
            System.out.printf("The money is enough - it would cost %.2flv.", expense);
        }else{
            System.out.printf("Ivan Cho will need %.2flv more.", expense - money);
        }

    }
}
