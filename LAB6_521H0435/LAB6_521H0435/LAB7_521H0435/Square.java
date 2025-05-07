public class Square extends Rectangle {

    public Square(String color, boolean filled, double side) {
      super(color, filled, side, side);
    }
  
    @Override
    public double getArea() {
      return super.getArea();
    }
  
    @Override
    public double getPerimeter() {
      return super.getPerimeter();
    }
  
    @Override
    public void setWidth(double width) {
      super.setWidth(width);
      super.setHeight(width);
    }
  
    @Override
    public void setHeight(double height) {
      super.setWidth(height);
      super.setHeight(height);
    }
  
    @Override
    public String toString() {
      return "Square{" +
          "side=" + super.getWidth() +
          ", color='" + color + '\'' +
          ", filled=" + filled +
          '}';
    }
  }
  