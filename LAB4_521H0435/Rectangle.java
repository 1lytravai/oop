public class Rectangle {
    private String color, name;
    private double width, length;


    public Rectangle(String color, String name, double width, double length) {
        this.color = color;
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + "]";
    }

    public String getType() {
        double area = width * length;
        if (area >= 10) {
            return "A";
        } else if (area >= 5) {
            return "B";
        } else {
            return "C";
        }
    }
    public boolean isSquare() {
        boolean isSquare = true;
        if(width == length) {
            return isSquare;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("red", "R1", 12, 12);
        Rectangle rectangle2 = new Rectangle("blue", "R2", 10, 12);

        System.out.println("R1:" + rectangle1.getType());
        System.out.println("R2:" + rectangle2.isSquare());


    }


}
