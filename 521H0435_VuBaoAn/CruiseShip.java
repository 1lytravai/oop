public class CruiseShip extends LuxuryAccommodation {
    /* Code here */
    private boolean isBar;

    public CruiseShip(int idAccom, String nameAccom, String addressAccom, String cityAccom, boolean isPool,
            boolean isDrink, boolean isBreak, boolean isGym, int maxCus, int price, boolean isBar) {
        super(idAccom, nameAccom, addressAccom, cityAccom, isPool, isDrink, isBreak, isGym, maxCus, price);
        this.isBar = isBar;
    }

    public boolean isBar() {
        return isBar;
    }

    public void setBar(boolean isBar) {
        this.isBar = isBar;
    }

    @Override
    public String toString() {
        return String.format("CruiseShip [%d, %s, %s, %s, %s, %s, %s, %s, %s]", 
                              getIdAccom(), getNameAccom(), getAddressAccom(), getCityAccom(),
                              isBar, isPool(), isDrink(), isBreak(), isGym());
    }

}
