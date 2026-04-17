import java.util.Scanner;

public class Display {
    //1.1 Write a program to display any message:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String msg = sc.nextLine();
        System.out.println(msg);
    }
}
