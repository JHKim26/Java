public class Square {
    private double side;

    public Square(double sideLength, String name) {
        super(name);
        side = sideLength;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return side * 4;
    }
}
