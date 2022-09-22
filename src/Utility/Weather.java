package Utility;

import java.util.Scanner;
public class Weather {

    public static double windchill(double t, //Temperature
                                   double v) { //Velocity in MPH
        return 35.75 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }

    public static double getVelocity(Scanner s) {
        boolean valid = false;
        double velocity = 0;
        while (!valid) {
            //1int x = 0;
            //1while (x == 0) {

            System.out.print("Enter a wind velocity in MPH: ");
            if (s.hasNextDouble()) {
                velocity = s.nextDouble();
                //1x = 1;
                if (velocity < 0) {
                    System.out.printf("Error: velocity cannot be negative. You entered %.2f", velocity);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: Please enter a decimal number. You entered \"%s/", s.next());
            }
        }//while
        return velocity;
    }

public static double getTemperature(Scanner t){
    System.out.print("Enter a temperature in degrees F: ");
    double temperature = 0;
        if (t.hasNextDouble()) {
        temperature = t.nextDouble();

    } else {
        System.out.printf("Error: Please enter a decimal number. You entered \"%s\"", t.next());
    }
    return temperature; //exit main
}
    public static void main(String[] args) {

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);
        double temperature = getTemperature(kbd);
        double velocity = getVelocity(kbd);

            System.out.printf("The windchill for %.1f degrees at %.1f MPH is %.2f\n",
                    temperature, velocity, windchill(velocity, temperature));


            System.out.println("They said \"don't do it\"");


    }
}
