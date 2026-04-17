import java.util.Scanner;

public class LeapYear {
    //1.7 Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }

    }
}
