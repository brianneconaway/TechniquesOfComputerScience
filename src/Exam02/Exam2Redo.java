package Exam02;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Exam2Redo {

    public static String[] load_words(String path, int n) {
        // connect to the webpage of speeds
        URL url = null; // null is the nothing value, None from python
        Scanner s = null;
        try {
            url = new URL(path); // create a URl object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Create an array of strings
        String[] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            String t = s.nextLine();
            if (reverse(t).equals(t)) //I can't figure out how to pass non-null string through words
                words[i++] = t;
        }
        return words;
    }

    public static String reverse(String r) {
        if (r.length() == 0)
            return "";
        else
            return reverse(r.substring(1)) + r.charAt(0);
    }

    public static void main(String[] args) {
        String[] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 9);
            System.out.println(reverse(Arrays.toString(words))); //not sure what the brackets are doing, ignore those
        }
    }


