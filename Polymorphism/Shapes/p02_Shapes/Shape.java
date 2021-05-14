package p02_Shapes;

public abstract class Shape {
    private double perimeter;
    private double area;


    protected abstract void calculatePerimeter();
    protected abstract void calculateArea();

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
