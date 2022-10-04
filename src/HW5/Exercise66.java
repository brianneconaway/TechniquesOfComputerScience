package HW5;

public class Exercise66{

    public static boolean canSpell(String word, String tiles) {
        int index = 0;
        for (int i = 0; i < word.length(); i++){ //i keeps track of char in word
            index = tiles.indexOf(word.charAt(i)); //keeping track of char in tiles
            if (index == -1){
                return false;
            }
            tiles = tiles.substring(0, index) + tiles.substring(index+1); //removes the wanted character
        }
      return true;
       }


    public static void main(String [] args) {
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("guy", "cuuubjwdjkrtuguy"));
        System.out.println(!canSpell("boot", "axobasrt"));
        System.out.println(!canSpell("xy", "abcd"));
        System.out.println(canSpell("happy", "pygtahp"));
    }
}
