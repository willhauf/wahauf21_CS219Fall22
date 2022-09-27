package Chapter6Exercises;

public class Exercise65 {


    // return true if every letter in s appears exactly twice
    public static boolean isDoubloon(String s){

        for (int i = 0; i < s.length(); i++){
            int count = 0;
            for (int j = 0; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }// for
            if (count != 2) {
                return false;
            }
        }
        return true;
    }


    public static void main(String [] args){
        System.out.println(isDoubloon("appeases"));
    }


}
