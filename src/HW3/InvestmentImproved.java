package HW3;

import Utility.Investment;

import java.util.Scanner;

public class InvestmentImproved {

    public static void main(String[] args) {

        // prompt the user for c, r, t, n
        Scanner kbd = new Scanner(System.in);

        // get input c
        double c;
        System.out.print("Enter an initial deposit as a decimal: ");
        // check to see if the input is correct
        if (kbd.hasNextDouble()) {
            c = kbd.nextDouble();
            if (c < 0) {
                System.out.printf("Error: Invalid input. You entered \"%s\"\n.", c);
                return;
            }
        } else {
            System.out.printf("Error: Invalid input. You entered \"%s\"\n.", kbd.next());
            return; // exit main
        }

        // get input r
        double r;
        System.out.print("Enter an interest rate as a decimal: ");
        // check to see if the input is correct
        if (kbd.hasNextDouble()) {
            r = kbd.nextDouble();
            if (r < 0) {
                System.out.printf("Error: Invalid input. You entered \"%s\"\n.", r);
                return;
            }
        } else {
            System.out.printf("Error: Invalid input. You entered \"%s\"\n.", kbd.next());
            return; // exit main
        }

        // get input t
        int t;
        System.out.print("Enter the number of years as an integer: ");
        // check to see if input is correct
        if (kbd.hasNextInt()) {
            t = kbd.nextInt();
            if (t < 0) {
                System.out.printf("Error: Invalid input. You entered \"%s\"\n.", t);
                return;
            }
        } else {
            System.out.printf("Error: Invalid input. You entered \"%s\"\n.", kbd.next());
            return; // exit main
        }

        // get input n
        int n = 0;
        System.out.print("Enter the number of times compounded per year as an integer: ");
        // check to see if input is correct
        if (kbd.hasNextInt()) {
            n = kbd.nextInt();
            if (n < 0) {
                System.out.printf("Error: Invalid input. You entered \"%s\"\n.", n);
                return;
            }
        } else {
            System.out.printf("Error: Invalid input. You entered \"%s\"\n.", kbd.next());
            return;
        }


        // print out the output using the investment fn
        System.out.printf("Your investment is worth %.2f💰",Investment.investment(c,r,t,n));

    }

}



