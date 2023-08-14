package entities;

public class Rectangle {

    public double width;
    public double height;

    public double areaRectangle() {
        return width * height;
    }

    public double perimeterRectangle() {
        return 2 * (width + height);
    }

    public double diagonalRectangle() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
