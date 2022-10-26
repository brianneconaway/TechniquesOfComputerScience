package Chap6Exercises;

public class Exercise65 {

    public static boolean bitch(String s) {
        for(int i = 0; i < s.length(); i++){
            int count = 0;
            for(int j = 0; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count != 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(bitch("appeases"));
        System.out.println(bitch("abba"));
        System.out.println(!bitch("bitch"));

    }
}
