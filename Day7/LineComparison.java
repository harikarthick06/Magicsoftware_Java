package Day7;

import java.util.Scanner;

/**
 * LineComparison main program demonstrating OOP concepts.
 * UC 1: Calculate length of a line based on two points (x1, y1) and (x2, y2)
 * UC 2: Check equality of two lines using Java equals method
 * UC 3: Compare two lines using Java compareTo method
 */
public class LineComparison {

    public static void main(String[] args) {
        // Display welcome message
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║   Welcome to Line Comparison Computation Program    ║");
        System.out.println("║              on Master Branch                       ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
        System.out.println("\nSTART\n");

        Scanner sc = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            displayMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    calculateLineLength(sc);
                    break;
                case 2:
                    checkLineEquality(sc);
                    break;
                case 3:
                    compareLines(sc);
                    break;
                case 4:
                    System.out.println("\nThank you for using Line Comparison Program. Goodbye!");
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }

    /**
     * Display the menu options
     */
    private static void displayMenu() {
        System.out.println("\n═════════════════════════════════════════════════════");
        System.out.println("Please select an option:");
        System.out.println("1. UC1 - Calculate Length of a Line");
        System.out.println("2. UC2 - Check Equality of Two Lines (using equals)");
        System.out.println("3. UC3 - Compare Two Lines (using compareTo)");
        System.out.println("4. Exit");
        System.out.println("═════════════════════════════════════════════════════");
        System.out.print("Enter your choice (1-4): ");
    }

    /**
     * UC 1: Calculate the length of a line based on two points
     * Length of a Line = sqrt((x2 - x1)^2 + (y2 - y1)^2)
     * 
     * @param sc Scanner object for user input
     */
    private static void calculateLineLength(Scanner sc) {
        System.out.println("\n--- UC 1: Calculate Length of a Line ---");
        System.out.println("As a fan of geometry, I want to model a line based on a point");
        System.out.println("consisting of (x, y) co-ordinates using the Cartesian system,");
        System.out.println("So that I can calculate its length.\n");

        System.out.print("Enter x1 coordinate: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1 coordinate: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2 coordinate: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2 coordinate: ");
        int y2 = sc.nextInt();

        Line line = new Line(x1, y1, x2, y2);
        System.out.println("\n" + line);
        System.out.println("Length Formula: sqrt((x2-x1)² + (y2-y1)²)");
        System.out.println("Calculation: sqrt((" + x2 + "-" + x1 + ")² + (" + y2 + "-" + y1 + ")²)");
        System.out.println("Result: " + String.format("%.4f", line.getLength()));
    }

    /**
     * UC 2: Check equality of two lines using Java equals method
     * 
     * @param sc Scanner object for user input
     */
    private static void checkLineEquality(Scanner sc) {
        System.out.println("\n--- UC 2: Check Equality of Two Lines ---");
        System.out.println("As a fan of geometry, I want to check equality of two lines");
        System.out.println("based on the end points, So that I know when two lines are equal.");
        System.out.println("Using Java equals method to check equality of 2 Lines is preferable.\n");

        System.out.println("Enter coordinates for Line 1:");
        System.out.print("  Enter x1 coordinate: ");
        int x1 = sc.nextInt();
        System.out.print("  Enter y1 coordinate: ");
        int y1 = sc.nextInt();
        System.out.print("  Enter x2 coordinate: ");
        int x2 = sc.nextInt();
        System.out.print("  Enter y2 coordinate: ");
        int y2 = sc.nextInt();

        System.out.println("\nEnter coordinates for Line 2:");
        System.out.print("  Enter x1 coordinate: ");
        int x3 = sc.nextInt();
        System.out.print("  Enter y1 coordinate: ");
        int y3 = sc.nextInt();
        System.out.print("  Enter x2 coordinate: ");
        int x4 = sc.nextInt();
        System.out.print("  Enter y2 coordinate: ");
        int y4 = sc.nextInt();

        Line line1 = new Line(x1, y1, x2, y2);
        Line line2 = new Line(x3, y3, x4, y4);

        System.out.println("\nLine 1: " + line1);
        System.out.println("Line 2: " + line2);
        System.out.println("\nComparison using equals() method:");
        System.out.println("line1.equals(line2) = " + line1.equals(line2));

        if (line1.equals(line2)) {
            System.out.println("✓ Both lines are EQUAL in length!");
        } else {
            System.out.println("✗ Lines are NOT EQUAL in length.");
            System.out
                    .println("  Difference: " + String.format("%.4f", Math.abs(line1.getLength() - line2.getLength())));
        }
    }

    /**
     * UC 3: Compare two lines using Java compareTo method
     * 
     * @param sc Scanner object for user input
     */
    private static void compareLines(Scanner sc) {
        System.out.println("\n--- UC 3: Compare Two Lines ---");
        System.out.println("As a fan of geometry, I want to compare two lines based on");
        System.out.println("the end points, So that I know one line is equal, greater or");
        System.out.println("less than the other line.");
        System.out.println("Using Java compareTo method to compare 2 Lines is preferable.\n");

        System.out.println("Enter coordinates for Line 1:");
        System.out.print("  Enter x1 coordinate: ");
        int x1 = sc.nextInt();
        System.out.print("  Enter y1 coordinate: ");
        int y1 = sc.nextInt();
        System.out.print("  Enter x2 coordinate: ");
        int x2 = sc.nextInt();
        System.out.print("  Enter y2 coordinate: ");
        int y2 = sc.nextInt();

        System.out.println("\nEnter coordinates for Line 2:");
        System.out.print("  Enter x1 coordinate: ");
        int x3 = sc.nextInt();
        System.out.print("  Enter y1 coordinate: ");
        int y3 = sc.nextInt();
        System.out.print("  Enter x2 coordinate: ");
        int x4 = sc.nextInt();
        System.out.print("  Enter y2 coordinate: ");
        int y4 = sc.nextInt();

        Line line1 = new Line(x1, y1, x2, y2);
        Line line2 = new Line(x3, y3, x4, y4);

        System.out.println("\nLine 1: " + line1);
        System.out.println("Line 2: " + line2);

        int comparisonResult = line1.compareTo(line2);

        System.out.println("\nComparison using compareTo() method:");
        System.out.println("line1.compareTo(line2) = " + comparisonResult);

        if (comparisonResult < 0) {
            System.out.println("✓ Line 1 is SHORTER than Line 2");
            System.out.println(
                    "  Line 2 is " + String.format("%.4f", line2.getLength() - line1.getLength()) + " units longer");
        } else if (comparisonResult > 0) {
            System.out.println("✓ Line 1 is LONGER than Line 2");
            System.out.println(
                    "  Line 1 is " + String.format("%.4f", line1.getLength() - line2.getLength()) + " units longer");
        } else {
            System.out.println("✓ Both lines are EQUAL in length");
        }
    }
}
