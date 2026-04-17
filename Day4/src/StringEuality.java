import java.util.Scanner;

public class StringEuality {
    //1.3 Write a program to check two strings are equal or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str1.equals(str2) ? "Equal" : "Not equal");
    }
}
