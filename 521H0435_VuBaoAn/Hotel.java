import java.util.ArrayList;

public class Hotel extends CommonAccommodation {
    /* Code here */
    private int numStar;

    public Hotel(int idAccom, String nameAccom, String addressAccom, String cityAccom, ArrayList<Room> hotelRooms,
            float rate, int numStar) {
        super(idAccom, nameAccom, addressAccom, cityAccom, hotelRooms, rate);
        this.numStar = numStar;
    }

    public Hotel(int idAccom, String nameAccom, String addressAccom, String cityAccom, float rate, int numStar) {
        super(idAccom, nameAccom, addressAccom, cityAccom, rate);
        this.numStar = numStar;
    }

    public int getNumStar() {
        return numStar;
    }

    public void setNumStar(int numStar) {
        this.numStar = numStar;
    }

    @Override
    public String toString() {
        return String.format("Hotel [%d, %d, %s, %s, %s]", 
                              getIdAccom(), numStar, getNameAccom(), getAddressAccom(), getCityAccom());
    }

}