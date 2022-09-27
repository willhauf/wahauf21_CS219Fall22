package Utility;

import java.util.Scanner;

public class Weather {


    // fn to calculate wind chill with inputs temp and wind velocity
    public static double wind_chill(double temp, double wind_v) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind_v, 0.16);
    }

    public static double getVelocity(Scanner kbd){
        double wind_velocity = 0;

        while (true) {
            System.out.print("Enter a wind velocity in mph: ");
            if (kbd.hasNextDouble()) {
                wind_velocity = kbd.nextDouble();
                if (wind_velocity < 0){
                    System.out.printf("Error: Velocity cannot be negative.  You entered %.2f", wind_velocity);
                }
                else {
                    break;
                }
            }
            else {
                System.out.printf("Error: invalid input.  You entered \"%s\"\n", kbd.next());
            }
        }
        return wind_velocity;
    }

    public static double getTemp(Scanner kbd) {
        double temperature = 0;

        boolean done = false;
        while (!done) {

            System.out.print("Enter temperature in degrees F: ");
            if (kbd.hasNextDouble()) {
                temperature = kbd.nextDouble();
                done = true;
            } else {
                System.out.printf("Error: invalid input.  You entered \"%s\"\n", kbd.next());
            }
        }
        return temperature;
    }

    // main program that prints out the windchill temp using the fn
    public static void main(String [] args) {

        // used or getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        double temperature = getTemp(kbd);

        double wind_velocity = getVelocity(kbd);

        System.out.printf("Windchill for %.1f degrees F and %.1f MPH wind is %.1f\n",
                temperature, wind_velocity, wind_chill(temperature, wind_velocity));
        }

}
