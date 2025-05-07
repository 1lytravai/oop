public class exercise2 {
    public static double computeTriangleArea(double height, double base) {
        double area = (base * height) / 2;
        return area;
    }

    public static void main(String[] args) {
        System.out.println(computeTriangleArea(3, 4));
    }
}
