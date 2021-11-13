public class Triangle extends Shape {
    double base, height, side1, side2; // base acts as third side

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double CalculateArea() {
        return base * height * 0.5;
    }

    public double CalculatePerimeter() {
        return side1 + side2 + base;
    }
}
