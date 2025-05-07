public class Room {
    /* Code here */
    private int idRoom;
    private String nameRoom; 
    private int numFloor;
    private String typeRoom;
    private int numBed;
    private int numMax;
    private double area, fee;
    
    public Room(int idRoom, String nameRoom, int numFloor,  String typeRoom, int numBed, int numMax,  double area,
            double fee) {
        this.idRoom = idRoom;
        this.numFloor = numFloor;
        this.numBed = numBed;
        this.numMax = numMax;
        this.nameRoom = nameRoom;
        this.typeRoom = typeRoom;
        this.area = area;
        this.fee = fee;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }

    public int getNumBed() {
        return numBed;
    }

    public void setNumBed(int numBed) {
        this.numBed = numBed;
    }

    public int getNumMax() {
        return numMax;
    }

    public void setNumMax(int numMax) {
        this.numMax = numMax;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString() {
        return String.format("Room [%d, %s, %d, %s, %d, %d, %.2f, %.2f]", 
                              idRoom, nameRoom, numFloor, typeRoom, numBed, numMax, area, fee);
    }

}
