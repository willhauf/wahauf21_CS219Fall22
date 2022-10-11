package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SwallowStats {
    public static void swallow_stats(){

        // connect to the web page of speeds
        URL url = null; // null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path);  // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double sum = 0;
        int count = 0;
        double min = 10000;
        double max = 0;

        while (true){

            if (!s.hasNextLine())
                break;

            String line= s.nextLine();  // read a line of the website

            if (line.indexOf("#") == -1 && line.length() > 0){
                sum = sum + Double.parseDouble(line);
                count++;

                if (Double.parseDouble(line) < min)
                    min = Double.parseDouble(line);

                if (Double.parseDouble(line) > max)
                    max = Double.parseDouble(line);
            }
        }
        double avg = sum / count;
        System.out.println("SWALLOW STATS:");
        System.out.printf("avg speed:\t%.2f\n", avg);
        System.out.printf("min speed:\t%.2f\n", min);
        System.out.printf("max speed:\t%.2f\n", max);

    }


    public static void main(String [] args){
       swallow_stats();

    }


}
