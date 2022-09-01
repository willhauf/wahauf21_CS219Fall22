public class Weather {


    // fn to calculate wind chill with inputs temp and wind velocity
    public static double wind_chill(double temp, double wind_v) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind_v, 0.16);
    }

    // main program that prints out the windchill temp using the fn
    public static void main(String [] args) {

        System.out.println(wind_chill(32.0, 10.0));
    }

}
