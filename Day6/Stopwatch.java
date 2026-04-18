package Day6;

import java.util.Scanner;

public class Stopwatch {

    static long startTime;
    static long stopTime;

    // Start stopwatch
    public static void start() {
        startTime = System.currentTimeMillis();
    }

    // Stop stopwatch
    public static void stop() {
        stopTime = System.currentTimeMillis();
    }

    // Get elapsed time
    public static long elapsedTime() {
        return stopTime - startTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press Enter to Start Stopwatch");
        sc.nextLine();
        start();

        System.out.println("Stopwatch Started...");
        System.out.println("Press Enter to Stop Stopwatch");
        sc.nextLine();
        stop();

        long time = elapsedTime();

        System.out.println("Elapsed Time = " + time + " milliseconds");
        System.out.println("Elapsed Time = " + (time / 1000.0) + " seconds");

        sc.close();
    }
}