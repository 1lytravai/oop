
public class TestRegularPolygon {
    public static void main(String[] args) {
        
        RegularPolygon rp = new RegularPolygon("q1",6,2);

        System.out.println("Info of polygon: " + rp);
        System.out.println("polygon type: " + rp.getPolygon());
        
        System.out.println("Perimeter of polygon: " + rp.getPerimeter());
        System.out.println("Area: " + rp.getArea());

    }
}
