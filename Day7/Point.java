package Day7;

/**
 * Point class represents a point in a 2D Cartesian coordinate system
 * with x and y coordinates.
 */
public class Point {
    private int x;
    private int y;

    /**
     * Constructor to initialize a Point with x and y coordinates
     * 
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter for x coordinate
     * 
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Setter for x coordinate
     * 
     * @param x the x-coordinate to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter for y coordinate
     * 
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Setter for y coordinate
     * 
     * @param y the y-coordinate to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns string representation of the Point
     * 
     * @return String representation
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Checks if two Points are equal based on their coordinates
     * 
     * @param obj the object to compare
     * @return true if coordinates are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Point point = (Point) obj;
        return this.x == point.x && this.y == point.y;
    }

    /**
     * Returns hash code for the Point
     * 
     * @return hash code
     */
    @Override
    public int hashCode() {
        return 31 * x + y;
    }
}
