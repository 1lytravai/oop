import java.util.ArrayList;

public class Resort extends CommonAccommodation {
    /* Code here */
    private int numStar;
    private boolean isPool;
    public Resort(int idAccom, String nameAccom, String addressAccom, String cityAccom, ArrayList<Room> resortRooms,
            float rate, int numStar, boolean isPool) {
        super(idAccom, nameAccom, addressAccom, cityAccom, resortRooms, rate);
        this.numStar = numStar;
        this.isPool = isPool;
    }
    public Resort(int idAccom, String nameAccom, String addressAccom, String cityAccom, float rate, int numStar,
            boolean isPool) {
        super(idAccom, nameAccom, addressAccom, cityAccom, rate);
        this.numStar = numStar;
        this.isPool = isPool;
    }
   
    public int getNumStar() {
        return numStar;
    }
    public void setNumStar(int numStar) {
        this.numStar = numStar;
    }
    public boolean isPool() {
        return isPool;
    }
    public void setPool(boolean isPool) {
        this.isPool = isPool;
    }

    @Override
    public String toString() {
        return String.format("Resort [%d, %s, %d, %s, %s, %s]", 
                              getIdAccom(), getNameAccom(), numStar, getAddressAccom(), 
                              isPool , getCityAccom());
    }
}
