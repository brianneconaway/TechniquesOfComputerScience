package Crypto;

public class Caesar {

    public static String E(String clear, int key){
        String cipher = "";
        final int alpha_length = 26; //This should never change

        for ( int i = 0; i < clear.length(); i++){
            char clear_char = clear.charAt(i);
            int clear_char_pos = clear_char - 'a';
            int cipher_char_pos = Math.floorMod(clear_char_pos + key, alpha_length);
            char cipher_char = (char) (cipher_char_pos + 'a');
            //cipher = cipher + cipher_char; same thing as line below
            cipher += cipher_char;
        }
        return cipher;
    }

    public static String D(String cipher, int key){
        String clear = "";
        final int alpha_length = 26; //This should never change

        for ( int i = 0; i < cipher.length(); i++){
            char cipher_char = cipher.charAt(i);
            int cipher_char_pos = cipher_char - 'a'; //Position in alphabet
            int clear_char_pos = Math.floorMod(cipher_char_pos - key, alpha_length);
            char clear_char = (char) (cipher_char_pos + 'a');           //^ mod parameter
            //cipher = cipher + cipher_char; same thing as line below
            clear += clear_char;
        }
        return clear;
    }

    public static String d(String cipher, int key){
        return E(cipher, - key);
    }

    //}

    public static void main(String[] args){
        System.out.println(E("cold", 20).equals("wifx")); // encryption text
        System.out.println(D("cold", 20).equals("cold")); // clear text
                                              //     ^ The == for strings
        //System.out.println(d("cold", 20).equals("cold"));
    }

}
