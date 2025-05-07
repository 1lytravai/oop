import java.util.ArrayList;

public class CommonAccommodation extends Accommodation {
   /* Code here */
   private ArrayList<Room> rooms;
   private float rate;

   public CommonAccommodation(int idAccom, String nameAccom, String addressAccom, String cityAccom,
         ArrayList<Room> rooms, float rate) {
      super(idAccom, nameAccom, addressAccom, cityAccom);
      this.rooms = rooms;
      this.rate = rate;
   }

   public CommonAccommodation(int idAccom, String nameAccom, String addressAccom, String cityAccom, float rate) {
      super(idAccom, nameAccom, addressAccom, cityAccom);
      this.rooms = new ArrayList<>();
      this.rate = rate;
   }

   public ArrayList<Room> getRooms() {
      return rooms;
   }

   public void setRooms(ArrayList<Room> rooms) {
      this.rooms = rooms;
   }

   public float getRate() {
      return rate;
   }

   public void setRate(float rate) {
      this.rate = rate;
   }
}

