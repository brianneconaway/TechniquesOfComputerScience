package HW1;

public class Time {
    public static void main(String [] args) {
        // Current time
        int hour = 15;
       int minute = 23;
       int second = 20;

        // Time
        System.out.print(hour + ":" + minute + ":" + second);

        //Seconds since midnight
        System.out.println(" is " + (hour*3600 + (minute*60 + second)) + " seconds since midnight");

        // Seconds remaining
        System.out.println("There are " + (86400 - (hour*3600 + (minute*60 + second))) + " seconds remaining.");

        //percent of day passed
        double percent = ((hour*3600 + (minute*60 + second)) * 100 / 86400);
        System.out.println(percent + "% of the day has elapsed.");

    }
}
