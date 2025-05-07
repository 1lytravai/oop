public class Circle{
    protected double radius;
    protected String color;
    public static final double PI = 3.141592653589793;

    public Circle() {
        this.radius = 1.0f;
        this.color = "red";
    }

    public Circle(Circle c) {
        this.radius = c.radius;
        this.color = c.color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius*this.radius*PI;
    } 

    @Override
    public String toString() {
        return this.radius + " " + this.color + " " + getArea();
    }
}