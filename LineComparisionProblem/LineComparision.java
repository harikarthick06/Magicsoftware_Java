package LineComparisionProblem;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        double Euc1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double Euc2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
        if(Euc1 == Euc2) System.out.println("Equal");
        else if(Euc1 > Euc2) System.out.println("Line 1 is greater than Line 2");
        else System.out.println("Line 2 is greater than Line 1");
    }
}