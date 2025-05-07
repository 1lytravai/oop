import java.util.ArrayList;

public class ShapeTest {

  public static void main(String[] args) {

    Shape circle1 = new Circle(4, "Red", true);
    Shape rectangle1 = new Rectangle(8, 4, "Blue", true);
    Shape square1 = new Square(10, "Black", true);
    Shape circle2 = new Circle(9);
    Shape rectangle2 = new Rectangle(12, 8, "Blue", true);

    ArrayList<Shape> shapes = new ArrayList<Shape>();
    shapes.add(circle1);
    shapes.add(rectangle1);
    shapes.add(square1);
    shapes.add(circle2);
    shapes.add(rectangle2);

    Shape shapeWithLargestArea = shapes.get(0);
    for (int i = 1; i < shapes.size(); i++) {
      if (shapes.get(i).getArea() > shapeWithLargestArea.getArea()) {
        shapeWithLargestArea = shapes.get(i);
      }
    }

    System.out.println("Shape with the largest area: " + shapeWithLargestArea.toString());
  }
}
