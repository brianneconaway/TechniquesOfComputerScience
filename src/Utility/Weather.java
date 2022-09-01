package Utility;

import java.util.Scanner;
public class Weather {

    public static double windchill(double v, //Temperature
                                   double t) { //Velocity in MPH


        return 35.75 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
    }

    public static void main(String[] args){

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);


        System.out.print("Enter a temperature in degrees F: ");
        double temperature = kbd.nextDouble();

        System.out.print("Enter a wind velocity in MPH: ");
        double velocity = kbd.nextDouble();

        System.out.printf("The windchill for %.1f degrees at %.1f MPH is %.2f\n",
                temperature, velocity, windchill(velocity, temperature));


        System.out.println("They said \"don't do it\"");



        }
}
