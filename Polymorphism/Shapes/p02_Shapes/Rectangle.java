package p02_Shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.setHeight(height);
        this.setWidth(width);
        this.calculatePerimeter();
        this.calculateArea();
    }

    @Override
    protected void calculatePerimeter() {
        System.out.println(4 * this.width);
    }

    @Override
    protected void calculateArea() {
        System.out.println(this.getWidth() * this.getHeight());
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private void setWidth(double width) {
        this.width = width;
    }
}
