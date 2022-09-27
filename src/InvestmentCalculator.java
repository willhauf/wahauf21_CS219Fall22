import Utility.Investment;

import java.util.Scanner;

public class InvestmentCalculator {

    public static void main(String [] args) {

        // prompt the user for c, r, t, n
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter an initial deposit as a decimal: ");
        double c = kbd.nextDouble();

        System.out.print("Enter an interest rate as a decimal: ");
        double r = kbd.nextDouble();

        System.out.print("Enter the number of years as an integer: ");
        int t = kbd.nextInt();

        System.out.print("Enter the number of times compounded per year as an integer: ");
        int n = kbd.nextInt();

        // print out the output using the investment fn
        System.out.printf("Your investment is worth %.2f💰", Investment.investment(c, r, t, n));

    }
}
