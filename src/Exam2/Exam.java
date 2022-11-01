package Exam2;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static RecursionExamples.Recursion.isPalindrome2;

public class Exam {
    public static String[] load_words(String path, int n) {
        URL url = null; // null is the nothing value, None from python
        Scanner s = null;

        try {
            url = new URL(path); // create a URl object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Create an array of strings
        String[] words = new String[n]; //wtf why is words a string when it is defined as an array
        while (s.hasNextLine()) {
            for (int i = 0; i < words.length; i++) //also why is this fine without a brace wtf
                if (words.length < 2)
                    return words;
                else if (Objects.equals(words[0], words[words.length - 1]) && isPalindrome2(words[1] + words[words.length - 1]))
                    return words;
            }
        return words;
    } // imma be honest I am so confused, nothing is as it seems
    // I could define an int, and it would turn into a string, so I don't know what to do


    public static void main(String[] args) {
        String[] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);
        load_words(Arrays.toString(words), 2309); //is this even the right way to call it?
    }
}
