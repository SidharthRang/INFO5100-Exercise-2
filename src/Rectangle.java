public class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double CalculateArea() {
        return length * width;
    }

    public double CalculatePerimeter() {
        return 2 * (length + width);
    }
}
