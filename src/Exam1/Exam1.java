package Exam1;
import java.util.Scanner;

public class Exam1 {

    public static int number27() {
        Scanner kbd = new Scanner(System.in);
        while (true) {
            if (kbd.hasNextInt()) { //checking type
                int v = kbd.nextInt();
                if (v < 0) { // Checking that it is positive
                    System.out.println("Error: the integer should be greater than zero. You entered" + v);
                    System.out.print("Please enter a positive integer: "); //Prompting again
                } else {
                    return v;
                }
            } else {
                System.out.println("Error: integer expected. You entered " + kbd.next());//If it is not an int
                System.out.print("Please enter a positive integer: "); //Prompting again
            }
        }
    }

    public static int doingStuff(int s) {
        int count = 0;
        System.out.println("hi");
        while(s>0){
            int last_dig = s % 10;
            if (last_dig > 2 && last_dig < 7){ // First time I was trying to treat it like an array of #s
                count++;
            }
            s = s/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a positive integer: ");
        int number = number27();
        int doing = doingStuff(number);
        System.out.printf("Your number has " + doing + " numbers between 2 and 7. :)"); //where I would put this statement
        // friendly input output
    }//This would be so much easier in one function, because then my count
    // would print and all would be right with the world. :(
}
