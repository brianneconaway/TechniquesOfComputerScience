package ExamStudy;

public class Exam1Study {
        public static int checksum(int n){
            int sum = 0;
            while (n > 1) {
                sum = sum + n % 10;
                n = n + 10;
        }
return sum % 10;
    }
    public static void main(String[]args)  {
        System.out.printf("%f\n", checksum(4293));
    }
}


