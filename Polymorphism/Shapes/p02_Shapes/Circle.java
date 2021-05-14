package p02_Shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        setRadius(getRadius());
        this.calculatePerimeter();
        this.calculateArea();
    }

    @Override
    protected void calculatePerimeter() {
        System.out.println(Math.PI * 2 * this.radius);
    }

    @Override
    protected void calculateArea() {
        System.out.println(Math.PI * radius * radius);
    }

    public final double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }
}
