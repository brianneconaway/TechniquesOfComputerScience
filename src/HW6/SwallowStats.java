/* Brianne Conaway
HW6
10-11-22
 */
package HW6;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {
    public static void swallow_stats() {

        // connect to the webpage of speeds
        URL url = null; // null is the nothing value, None from python
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URl object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //What is true? I was able to connect to the website

        double sum = 0.0;
        int count = 0;
        double min = Double.POSITIVE_INFINITY;
        double max = -Double.POSITIVE_INFINITY;
        // read each line of the web file
        while (s.hasNextLine()) {
            String line = s.nextLine(); // read a line of the website
            if (line.equals(""))
                continue;
            if (line.indexOf('#') == -1) {
                sum = sum + Double.parseDouble(line);
                count++;


                if (Double.parseDouble(line) < min) {
                    min = Double.parseDouble(line);


                }
                if (Double.parseDouble(line) > max) {
                    max = Double.parseDouble(line);
                }
            }
        }
        System.out.printf("Average swallow speeds is %.2f\n", sum / count);
        System.out.printf("The minimum swallow speed is %.2f\n", min);
        System.out.printf("The maximum swallow speed is %.2f\n", max);
    } //avg _swallow_speed


    public static void main(String[] args) {
        swallow_stats();
    }

}

