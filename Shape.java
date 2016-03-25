public abstract class Shape {
    private String name;

    public Shape(String shapeName) {
        name = shapeName;
    }

    public String getName() {
        return name;
    }

    // abstract methods
    // cannot implemented here
    public abstract double area();
    public abstract double perimeter();
    
    public void sayName() {
        System.out.println("name is: " + name);
    }
}
