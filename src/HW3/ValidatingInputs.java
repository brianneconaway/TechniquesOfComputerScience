/* Brianne Conaway
*09/14/2022
*HW3
*/

package HW3;
import Utility.Investment;

import java.util.Scanner;

public class ValidatingInputs {

    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r / n, t * n);
    }

    public static void main(String[] args) {
double c = 0.0;
double r = 0.0;
int t = 0;
int n = 0;
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter initial deposit as a decimal: ");
        if (kbd.hasNextDouble()) { //checking the type
            c = kbd.nextDouble();
            if (c < 0) { //checking to see if it is a neg number
                System.out.println("Error: initial deposit should be greater than zero. You entered " + c);
                System.exit(1); //stops the function
            }
        } else {
            System.out.println("Error: integer expected. You entered " + kbd.next()); //checking to see if it is a string
            System.exit(1);

        }

        System.out.print("Enter interest rate as decimal: ");
        if (kbd.hasNextDouble()) { //checking type
            r = kbd.nextDouble();
            if (r < 0) { // checking if the IR is neg
                System.out.println("Error: interest rate should be greater than zero. You entered " + r);
                System.exit(1);
            if (r > 1) ; //Checking if the rate is between 0-1
                System.out.println("Error: interest rate should be expressed as a decimal between 0 and 1. For example 8% should be entered as .08. You entered " + kbd.next());
                System.exit(1);}
        } else { //Checks to see if it printed a string
            System.out.println("Error: integer expected. You entered " + kbd.next());
            System.exit(1);
        }


        System.out.print("Enter the number of years as an integer: ");
        if (kbd.hasNextInt()) { //checking type
            t = kbd.nextInt();
            if (t < 0) { // checking if the IR is neg
                System.out.println("Error: the number of years should be greater than zero. You entered " + t);
                System.exit(1);
            }
        } else { //Checks to see if it printed a string
            System.out.println("Error: integer expected. You entered  " + kbd.next());
            System.exit(1);
        }

        System.out.print("Enter a number of times to compound per year: ");
        if (kbd.hasNextInt()) { //checking type
            n = kbd.nextInt();
            if (n < 0) { // checking if the IR is neg
                System.out.println("Error: the number of time to compound should be greater than zero. You entered " + n);
                System.exit(1);
            }
        } else { //Checks to see if it printed a string
            System.out.println("Error: integer expected. You entered  " + kbd.next());
            System.exit(1);

        }
        System.out.println(investment(c, r, t, n));
    }

}