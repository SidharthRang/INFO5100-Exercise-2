public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double CalculateArea() {
        return Math.PI * radius * radius;
    }

    public double CalculatePerimeter() {
        return 2 * radius * Math.PI;
    }

}
