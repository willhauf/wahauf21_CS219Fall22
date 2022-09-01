package HW1;

public class Time {
    public static void main(String [] args) {
        // define the variables
        int hour = 11;
        int minute = 20;
        int seconds = 48;
        int seconds_since_midnight = (hour * 3600) + (minute * 60) + seconds;
        int seconds_remaining = 86400 - seconds_since_midnight;
        int percent_day_passed = seconds_since_midnight * 100 / 86400;

        // print out the seconds past midnight
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.print(seconds);
        System.out.print(" is ");
        System.out.print(seconds_since_midnight);
        System.out.println(" seconds past midnight.");

        // print out the seconds remaining in the day
        System.out.print("There are ");
        System.out.print(seconds_remaining);
        System.out.println(" seconds remaining in the day. ");

        // print out the percentage of the day that has passed
        System.out.print(percent_day_passed);
        System.out.println("% of the day has elapsed.");

    }
}
