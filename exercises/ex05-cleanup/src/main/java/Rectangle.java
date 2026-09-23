/**
 * A rectangle with a width and a height.
 */
public class Rectangle {

    private double width;
    private double height;

    /**
     * Creates a rectangle with the given dimensions.
     *
     * @param w the width of the rectangle
     * @param h the height of the rectangle
     */
    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    /**
     * Returns the area of this rectangle.
     *
     * @return the width multiplied by the height
     */
    public double area() {
        return width * height;
    }

    /**
     * Scales the width and height of this rectangle.
     *
     * @param factor the factor by which both dimensions are multiplied
     */
    public void scale(double factor) {
        width = width * factor;
        height = height * factor;
    }

    /**
     * Checks whether this rectangle has a greater area than another rectangle.
     *
     * @param other the rectangle to compare with this rectangle
     * @return true if this rectangle has a greater area than other; false otherwise
     */
    public boolean isLargerThan(Rectangle other) {
        return area() > other.area();
    }
}