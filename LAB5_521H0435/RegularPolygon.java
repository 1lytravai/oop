
public class RegularPolygon {
    // properties 
    String name;
    int edgeAmount;
    double edgeLength;

    public RegularPolygon() {
        this.name = "";
        this.edgeAmount = 3;
        this.edgeLength = 1;
    }

    public RegularPolygon(String name, int edgeAmount, double edgeLength) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }

    public RegularPolygon(RegularPolygon polygon) {
        this.name = polygon.name;
        this.edgeAmount = polygon.edgeAmount;
        this.edgeLength = polygon.edgeLength;
    }

    public String getName() {
        return this.name;
    }
    public int getEdgeAmount() {
        return this.edgeAmount;
    }
    public double getEdgeLength() {
        return this.edgeLength;
    }

    public String getPolygon() {
        if(edgeAmount == 3) {
            return "Triangle";
        }
        else if(edgeAmount == 4) {
            return "Quadrangle";
        }
        else if(edgeAmount == 5) {
            return "Pentagon";
        }
        else if(edgeAmount == 6) {
            return "Hexagon";
        }
        else {
            return "Polygon has the edges greater than 6";
        }
    }

    public double getPerimeter() {

        double perimeter = (edgeAmount * edgeLength);
        return perimeter;
    }
    // Caculate Area of polygon 
    public double getArea() {
        double a = 1.0;
        if (edgeAmount==3) 
            a = 0.433;
        else if(edgeAmount==4) 
            a = 1; 
        else if(edgeAmount==5)
            a = 1.72; 
        else if(edgeAmount==6) 
            a = 2.595;
        else if(edgeAmount > 6)
            return -1;
        
        //Double dl = Double.valueOf(edgeLength);
        double area = (edgeLength*edgeLength)*a;

        return area;
    }
    @Override

    public String toString() {
        return this.name + " " + this.getPolygon() + " " + this.getArea();
    }
} 