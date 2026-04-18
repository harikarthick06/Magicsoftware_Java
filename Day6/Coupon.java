package Day6;

import java.util.*;

public class Coupon {

    // Function to generate random number between 1 and N
    public static int getCoupon(int n) {
        return (int)(Math.random() * n) + 1;
    }

    // Function to collect distinct coupons
    public static int collectCoupons(int n) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        while (set.size() < n) {
            int coupon = getCoupon(n);
            count++;

            if (!set.contains(coupon)) {
                set.add(coupon);
                System.out.println("Collected Coupon: " + coupon);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();

        int total = collectCoupons(n);

        System.out.println("Total random numbers generated: " + total);

        sc.close();
    }
}