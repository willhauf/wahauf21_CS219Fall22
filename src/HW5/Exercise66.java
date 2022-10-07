package HW5;

public class Exercise66 {

    public static boolean canSpell(String word, String tiles){
        String scrabble = ""; // string to append common letters to and compare to "word"

        for (int i = 0; i < word.length(); i++){
            for (int j = 0; j < tiles.length(); j++){
                // see if letter from word is in tiles
                char w_letter = word.charAt(i);
                char t_letter = tiles.charAt(j);
                // System.out.println("w: " + w_letter + "\t" + "t: " + t_letter);
                if (w_letter == t_letter){
                    scrabble += t_letter;
                    tiles = tiles.substring(0,j) + tiles.substring(j+1);
                    // System.out.println("scrabble: " + scrabble + "   tiles: " + tiles);
                    // System.out.println("-----------------------------");
                    break;
                }
            }
        }
        if (word.equals(scrabble))
            return true;

        else
            return false;
    }

    public static void main(String [] args){

        System.out.println(canSpell("boils", "jdsiolbse"));
        System.out.println(canSpell("boot", "axobasrto" ));
        System.out.println(!canSpell("grape", "dgjeprf"));
        System.out.println(!canSpell("hippo", "haxobapsrito" ));
    }




}
