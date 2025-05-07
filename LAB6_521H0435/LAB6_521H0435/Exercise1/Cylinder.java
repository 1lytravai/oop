public class Cylinder extends Circle {
    protected double height;
    public static final double PI = 3.141592653589793;

    public Cylinder() {
        super();
        this.height = 1.0f;
    }

    public Cylinder(Cylinder C) {
        super(C);
        this.height = C.height;
    }

    public Cylinder(double radius) {
        this.radius = radius;
    }

    
    public Cylinder(double radius, String color, double height) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return PI*this.radius*this.height*2;
    }

    @Override 
    public String toString() {
        return this.radius + " " + this.color + " " + this.height;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * this.radius * this.height;
    }
}