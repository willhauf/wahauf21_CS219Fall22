package Utility;

public class DigitExtractor {

    public static int last(int x){
        // x = Math.abs(x);
        if (x <0){
            x = -x;
        }

        return x % 10;
    }

    public static int secondtolast(int x){
        x = Math.abs(x);
        // int x2 = x % 100;
        // return x2 / 10;
        return (x /10) % 10;
    }

    public static void main(String [] args){
        System.out.println(last(2753) == 3);
        System.out.println(last(-749) == 9);
        System.out.println(secondtolast(2753) == 5);
        System.out.println(secondtolast(-749) == 4);

    }

}
