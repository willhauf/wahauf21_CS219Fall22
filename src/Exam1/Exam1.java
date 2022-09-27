package Exam1;

import java.util.Scanner;

public class Exam1 {

    public static int digits(int d){
        int count = 0;
        while (d > 0) {
            if (d % 10 > 2 && d % 10 < 7) {
                count++;
            }
            d = d / 10;
        }
        return count;
    }


    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Enter a positive integer: ");
            if (kbd.hasNextInt()) {
                n = kbd.nextInt();
                if (n < 0) {
                    System.out.printf("Error: Years cannot be negative. You entered %d\n", n);
                }
                else {
                    break;
                }
            }
            else {
                System.out.printf("Error: invalid input. You entered \"%s\"\n", kbd.next());
            }
        }
        System.out.printf("There are %d digits in %d that are between 2 and 7\n", digits(n), n);

    }
}