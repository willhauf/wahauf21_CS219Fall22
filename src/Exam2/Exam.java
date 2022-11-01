package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    public static boolean isPalindrome2(String s) {
        if (s.length() < 2)
            return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome2(s.substring(1, s.length() - 1)))
            return true;
        else
            return false;
    }

    public static String [] reverse(String [] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static String [] load_words(String path, int n) {
        // connect to the web page of speeds
        URL url = null; // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path);  // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String[n];

        int i = 0;
        while (s.hasNextLine())
            words[i++] = s.nextLine();

        // create array of palindromes from possible wordle solutions
        String [] palindromes = new String[9];
        int p_num = 0;
        for (int j = 0; j < words.length; j++){
            if (isPalindrome2(words[j])) {
                palindromes[p_num] = words[j];
                p_num++;
            }
        }
        return palindromes;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309))));
    }
}
