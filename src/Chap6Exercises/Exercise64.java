package Chap6Exercises;

public class Exercise64 {

    public static String toLower(String s){

        String r = "";
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                r = r + (char) ('a' + (ch - 'A'));
            }
            else{
                r = r + ch;
            }
        }
        return r;
    }

    public static boolean isAbecedarian(String s) {
        //s = s.toLowerCase();
        s = toLower(s);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(toLower("APPLE"));
        System.out.println(toLower("ApPLE%#*@($"));
        System.out.println(isAbecedarian("mossy"));
        System.out.println(!isAbecedarian("apple"));

    }
}


//public static boolean isAlphabetical(String s){
//int i = 0;
//while (i < s.length() - 1) {
//if (s.charAt(i) > s.charAt(i + 1)) {
//return false;
//}
//i++;
//}
//return true;