package HW4;
import java.util.Scanner;

public class BetterValidatingInputs {


    public static double getInitial() { //function for initial c
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter initial deposit rate as decimal: ");
        while (true) {
            if (kbd.hasNextDouble()) { //checking type
                double c = kbd.nextDouble();
                if (c < 0) {
                    System.out.println("Error: initial deposit should be greater than zero. You entered: " + c);
                    System.out.print("Enter initial deposit rate as decimal: ");
                }
                else{
                    return c;
                }

            } else{
                System.out.println("Error: integer expected. You entered " + kbd.next());
                System.out.println("Enter initial deposit rate as decimal: ");
            }
        }
    }


    public static double getInterest() {//function for interest r
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter interest rate as decimal: ");
        while (true) {
            if (kbd.hasNextDouble()) { //checking type
                double r = kbd.nextDouble();
                if (r < 0) {
                    System.out.println("Error: interest rate should be greater than zero. You entered: " + r);
                    System.out.print("Enter interest rate as decimal: ");

                } else if (r > 1) {  //Checking if the rate is between 0-1
                    System.out.println("Error: interest rate should be expressed as a decimal between 0 and 1. For example 8% should be entered as .08. You entered " + r);
                    System.out.print("Enter interest rate as decimal: ");
                }
                else{
                    return r;
                }
            } else{
                System.out.println("Error: integer expected. You entered " + kbd.next());
                System.out.print("Enter interest rate as decimal: ");
            }
        }
    }


    public static int getTime() {//function for time t
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter the number of years as an integer: ");
        while(true) {
            if (kbd.hasNextInt()) { //checking type
                int t = kbd.nextInt();
                if (t < 0) {
                    System.out.println("Error: the number of years should be greater than zero. You entered" + t);
                    System.out.print("Enter the number of years as an integer: ");
                }
                else {
                    return t;
            }
        }
         else{
            System.out.println("Error: integer expected. You entered " + kbd.next());
            System.out.print("Enter the number of years as an integer: ");
                }
            }
        }


    public static int getCompound() {//function for compound n
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a number of times to compound per year: ");
        while(true) {
            if (kbd.hasNextInt()) { //checking type
                int n = kbd.nextInt();
                if (n < 0) {
                    System.out.println("Error: the number of time to compound should be greater than zero. You entered " + n);
                    System.out.print("Enter a number of times to compound per year: ");
                }
                else {
                    return n;
                }
            }
            else{
                    System.out.println("Error: integer expected. You entered " + kbd.next());
                    System.out.print("Enter a number of times to compound per year: ");
                }
        }
        }


    public static double investment(double c, double r, int t, int n) {//math function
        return c * Math.pow(1 + r / n, t * n);
    }

    public static void main(String[] args) {
        double c = getInitial();
        double r = getInterest();
        int t = getTime();
        int n = getCompound();

        System.out.printf("The value would grow to be: %.2f\n", investment(c, r, t, n));
    }
}