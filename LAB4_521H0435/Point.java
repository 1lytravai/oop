public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }



    public static void main(String[] args) {
        Point point1 = new Point();
        System.out.println("Point 1 - x: " + point1.getX() + ", y: " + point1.getY());

        Point point2 = new Point(3.5f, 2.0f);
        System.out.println("Point 2 - x: " + point2.getX() + ", y: " + point2.getY());
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

}
