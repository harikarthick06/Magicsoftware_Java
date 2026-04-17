package Day5;

import java.util.*;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
        }
    }
}