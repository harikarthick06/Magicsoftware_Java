package LineComparisionProblem;
import java.util.Scanner;

public class LinesEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int Euc1 = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        int Euc2 = (int) Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
        System.out.println(Euc1 == Euc2);
    }
}