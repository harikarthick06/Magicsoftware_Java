package Day7;

/**
 * Line class represents a line in a 2D Cartesian coordinate system
 * using two endpoints. Implements Comparable for comparing line lengths.
 */
public class Line implements Comparable<Line> {
    private Point point1;
    private Point point2;

    /**
     * Constructor to initialize a Line with two Point objects
     * 
     * @param point1 the first endpoint of the line
     * @param point2 the second endpoint of the line
     */
    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Constructor to initialize a Line with coordinates
     * 
     * @param x1 x-coordinate of first point
     * @param y1 y-coordinate of first point
     * @param x2 x-coordinate of second point
     * @param y2 y-coordinate of second point
     */
    public Line(int x1, int y1, int x2, int y2) {
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
    }

    /**
     * Getter for first point
     * 
     * @return the first endpoint
     */
    public Point getPoint1() {
        return point1;
    }

    /**
     * Setter for first point
     * 
     * @param point1 the first endpoint to set
     */
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    /**
     * Getter for second point
     * 
     * @return the second endpoint
     */
    public Point getPoint2() {
        return point2;
    }

    /**
     * Setter for second point
     * 
     * @param point2 the second endpoint to set
     */
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    /**
     * Calculates the length of the line using Euclidean distance formula
     * Length = sqrt((x2 - x1)^2 + (y2 - y1)^2)
     * 
     * @return the length of the line
     */
    public double getLength() {
        int xDiff = point2.getX() - point1.getX();
        int yDiff = point2.getY() - point1.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Returns string representation of the Line
     * 
     * @return String representation showing both endpoints and length
     */
    @Override
    public String toString() {
        return "Line from " + point1 + " to " + point2 + " | Length: " + String.format("%.2f", getLength());
    }

    /**
     * UC 2: Checks if two Lines are equal based on their lengths
     * Using Java equals method to check equality of 2 Lines is preferable.
     * 
     * @param obj the object to compare
     * @return true if line lengths are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Line line = (Line) obj;

        // Compare lengths with a small tolerance for floating-point precision
        return Math.abs(this.getLength() - line.getLength()) < 1e-9;
    }

    /**
     * UC 3: Compares two Lines based on their lengths
     * Using Java compareTo method to compare 2 Lines is preferable.
     * 
     * @param other the other line to compare with
     * @return negative if this line is shorter, 0 if equal, positive if longer
     */
    @Override
    public int compareTo(Line other) {
        double lengthDifference = this.getLength() - other.getLength();

        if (lengthDifference < -1e-9)
            return -1; // This line is shorter
        else if (lengthDifference > 1e-9)
            return 1; // This line is longer
        else
            return 0; // Lines are equal
    }

    /**
     * Returns hash code for the Line
     * 
     * @return hash code based on length
     */
    @Override
    public int hashCode() {
        return Double.hashCode(getLength());
    }
}
