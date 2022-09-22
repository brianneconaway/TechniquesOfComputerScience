package StringPlay;

public class CharacterPlay {

    public static int countVowels(String s) {
       int count = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i); // get character at each index
            if (ch == 'a'||ch =='A'|| ch == 'e'|| ch=='E'||ch == 'i'||ch =='I'|| ch == 'o'|| ch=='O'||ch == 'u'||ch =='U');
            count++;
        }
        return count;
    }

    public static void main(String [] args){
        System.out.println(countVowels("applesauce")==5);
        System.out.println(countVowels("ze")==0);


        char ch = 'a'; // 'a' is just shorthand for integer code
                        // assigned by the unicode consortium
        System.out.println(ch);
        System.out.println((int)ch);
        System.out.println((char)('a' + 1));
        System.out.println((char)(960));
    }
}

