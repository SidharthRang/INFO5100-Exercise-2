public class App {
    public static void main(String[] args) throws Exception {
        Shape c = new Circle(5);
        Shape r = new Rectangle(6, 7);
        Rectangle s = new Square(5);
        Shape t = new Triangle(4, 5, 6, 6);

        // Print color of shape
        System.out.println("The color of all the shapes is " + Shape.color);

        // Print perimeter of all shapes
        System.out.println("The perimeter of Circle is " + String.format("%.2f", c.CalculatePerimeter()));
        System.out.println("The perimeter of Rectangle is " + r.CalculatePerimeter());
        System.out.println("The perimeter of Square is " + s.CalculatePerimeter());
        System.out.println("The perimeter of Triangle is " + t.CalculatePerimeter());

        // Print area of all shapes
        System.out.println("The area of Circle is " + String.format("%.2f", c.CalculateArea()));
        System.out.println("The area of Rectangle is " + r.CalculateArea());
        System.out.println("The area of Square is " + s.CalculateArea());
        System.out.println("The area of Triangle is " + t.CalculateArea());
    }
}
