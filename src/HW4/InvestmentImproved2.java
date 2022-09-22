package HW4;

import Utility.Investment;

import java.util.Scanner;

public class InvestmentImproved2 {

    public static void main(String[] args) {

        // prompt the user for c, r, t, n
        Scanner kbd = new Scanner(System.in);

        // get c
        double c;
        while (true) {
            System.out.print("Enter an initial deposit as a decimal: ");
            if (kbd.hasNextDouble()) {
                c = kbd.nextDouble();
                if (c < 0) {
                    System.out.printf("Error: Initial deposit cannot be negative. You entered %.2f\n", c);
                }
                else {
                    break;
                }
            }
            else {
                System.out.printf("Error: invalid input. You entered \"%s\"\n", kbd.next());
            }
        }
        // get r
        double r;
        while (true) {
            System.out.print("Enter an interest rate as a decimal: ");
            if (kbd.hasNextDouble()) {
                r = kbd.nextDouble();
                if (r < 0) {
                    System.out.printf("Error: Interest rate cannot be negative. You entered %.2f\n", r);
                }
                else {
                    break;
                }
            }
            else {
                    System.out.printf("Error: invalid input. You entered \"%s\"\n", kbd.next());
                }
            }
        // get t
        int t;
        while (true) {
            System.out.print("Enter the number of years: ");
            if (kbd.hasNextInt()) {
                t = kbd.nextInt();
                if (t < 0) {
                    System.out.printf("Error: Years cannot be negative. You entered %d\n", t);
                }
                else {
                    break;
                }
            }
            else {
                System.out.printf("Error: invalid input. You entered \"%s\"\n", kbd.next());
            }
        }
        // get n
        int n;
        while (true) {
            System.out.print("Enter the number of times compounded per year as an integer: ");
            if (kbd.hasNextInt()) {
                n = kbd.nextInt();
                if (n < 0) {
                    System.out.printf("Error: Times compounded cannot be negative. You entered %.2d\n", n);
                }
                else {
                    break;
                }
            }
            else {
                System.out.printf("Error: invalid input. You entered \"%s\"\n", kbd.next());
            }
        }

        // print out the output using the investment fn
        System.out.printf("Your investment is worth %.2f💰",Investment.investment(c,r,t,n));

        }

    }



