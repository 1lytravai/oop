import java.util.ArrayList;

public class Homestay extends CommonAccommodation {
    /* Code here */
    public Homestay(int idAccom, String nameAccom, String addressAccom, String cityAccom, ArrayList<Room> rooms,
    float rate) {
        super(idAccom, nameAccom, addressAccom, cityAccom, rooms, rate);
    }

    public Homestay(int idAccom, String nameAccom, String addressAccom, String cityAccom,float rate) { 
        super(idAccom, nameAccom, addressAccom, cityAccom, rate);
    }

    @Override
    public String toString() {
        return String.format("Homestay [%d, %s, %s, %.1f, %s]", 
        getIdAccom(), getNameAccom(), getAddressAccom(), getRate() , getCityAccom());
    }
    
}