/*  Will Hauf
    9/7/22
    HW2
 */
package HW2;

import java.util.Scanner;

public class DayOfWeek {

    //day of the week fn using equations from canvas
    public static int dayofweek(int month, int day, int year){

        int y0 = year - (14 - month)/12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = month + 12 * ((14 - month) / 12) - 2;

        int d0 = (day + x + 31 * m0 / 12) % 7;

        return d0;
    }
    // main program that asks for 3 input of a month, day and year
    public static void main(String [] args){
        // used or getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a month in number form: ");
        int month = kbd.nextInt();

        System.out.print("Enter a day in said month: ");
        int day = kbd.nextInt();

        System.out.print("Enter the year: ");
        int year = kbd.nextInt();

        // print out the return value of the day of the week function using the scanner inputs
        System.out.println(dayofweek(month, day, year));

    }

}
