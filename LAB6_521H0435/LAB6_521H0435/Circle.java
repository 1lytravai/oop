public class Circle extends Shape{
    private double radius;
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }


    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return (3.14 * radius * radius);
    }

    public double getPerimeter(){
        return (2 * radius * 3.14);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }


    
}
