package Day5;

import java.util.Scanner;

public class Array2d {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        for (int[] row : arr) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
