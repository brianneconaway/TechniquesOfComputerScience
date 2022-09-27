package Exam1;
import java.util.Scanner;

public class Exam1 {

    public static int number27(int n){
        Scanner kbd = new Scanner(System.in);
        while(true) {
            if (kbd.hasNextInt()) { //checking type
                int v = kbd.nextInt();
                if (v < 0) { // Checking that it is positive
                    System.out.println("Error: the integer should be greater than zero. You entered" + v);
                    System.out.print("Please enter a positive integer: "); //Prompting again
                }
                else {
                    return n;
                }
            }
            else{
                System.out.println("Error: integer expected. You entered " + kbd.next());//If it is not an int
                System.out.print("Please enter a positive integer: "); //Prompting again
            }
        }
    }
    public static int doingStuff(int s){
        int count = 0;
        for (int i = 0; i <= s; i++){
            if (2 < i && i < 7) {// if it is between 2 and 7
                count++;
                System.out.println("Your number has " + count + "numbers between 2 and 7. :)");;
            }// only place count isn't read because my count is defined here
        }
        return 0; //if it has no numbers
    }

    public static void main(String[] args){
        //int doing = doingStuff(kbd);
        //int number = number27(kbd);
        System.out.println("Please enter a positive integer: ");
        System.out.println("Your number has " + count + "numbers between 2 and 7. :)"); //where I would put this statement
                                                                  // friendly input output
    }//This would be so much easier in one function, because then my count
    // would print and all would be right with the world. :(
}
