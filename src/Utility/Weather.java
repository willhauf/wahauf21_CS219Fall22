package Utility;

import java.util.Scanner;

public class Weather {


    // fn to calculate wind chill with inputs temp and wind velocity
    public static double wind_chill(double temp, double wind_v) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind_v, 0.16);
    }

    // main program that prints out the windchill temp using the fn
    public static void main(String [] args) {

        // used or getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter temperature in degrees F: ");
        double temperature = kbd.nextDouble();

        System.out.print("Enter a wind velocity in mph: ");
        double wind_velocity = kbd.nextDouble();

        System.out.printf("Windchill for %.1f degrees F and %.1f MPH wind is %.1f\n",
                temperature, wind_velocity, wind_chill(temperature, wind_velocity));
    }

}
