public class Square extends Rectangle {
    public Square(double side) {
        super(side, side); // set values of length and breadth in Rectangle class
    }

    public double CalculatePerimeter() {
        return this.length * 4; //override parent method with new formula
    }
}
