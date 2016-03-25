public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5, "circle1");
        Circle c2 = new Circle(10, "circle2");
        Integer i = new Integer(3);
        System.out.println(c1.isBiggerThan(c2));// true
    }
}
