package Day5;

import java.util.*;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int heads = 0, tails = 0;

        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5)
                tails++;
            else
                heads++;
        }

        System.out.println("Heads %: " + (heads * 100.0 / n));
        System.out.println("Tails %: " + (tails * 100.0 / n));
    }
}