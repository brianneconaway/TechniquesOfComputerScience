package HW2;

import java.util.Scanner;

public class DayOfWeek {
    public static int week(int m,
                              int d,
                              int y) {

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + 31 * m0 / 12) % 7;

    }

        public static void main(String[] args){

            Scanner kbd = new Scanner(System.in);

            System.out.print("Enter a month: ");
            int month = kbd.nextInt();

            System.out.print("Enter a day: ");
            int day = kbd.nextInt();

            System.out.print("Enter a year: ");
            int year = kbd.nextInt();


            System.out.printf("The number of the week is: %d\n", (week(month, day, year)));

        }
    }
