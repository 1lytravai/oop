public class TestCylinder {
    public static final double PI = 3.141592653589793;
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(2.0, "blue", 3.0);
        Cylinder c2 = new Cylinder();
        Cylinder c3 = new Cylinder(3.0, 2.0);

        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());
        System.out.println("c3: " + c3.toString());

        c3.setColor("red");

        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Area of c2: " + c2.getArea());
        System.out.println("Area of c3: " + c3.getArea());

        System.out.println("Volume of c1: " +c1.getVolume());
        System.out.println("Volume of c2: " +c2.getVolume());
        System.out.println("Volume of c3: " +c3.getVolume());
    }
}