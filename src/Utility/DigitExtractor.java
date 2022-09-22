package Utility;

public class DigitExtractor {

    public static int last(int n) {
        if (n < 0) {
            n = -n;
        }
        return n%10;
    }

    public static int secondToLast(int n) {
        n = Math.abs(n);
        return (n / 10) % 10;
    }

    public static int thirdToLast(int n) {
        n= Math.abs(n);
        return (n/100) % 10;
    }

    public static void main(String[] args) {
        System.out.println(last(2753)==3);
        System.out.println(last(-749)==9);
        System.out.println(secondToLast(1234)==3);
        System.out.println(secondToLast(-1234)==3);
        System.out.println(thirdToLast(-1234)==2);
        System.out.println(thirdToLast(-1234)==2);
    }
}
