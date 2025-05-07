public class LuxuryAccommodation extends Accommodation {
    /* Code here */
    private boolean isPool, isDrink, isBreak, isGym;
    private int maxCus, price;

    public LuxuryAccommodation(int idAccom, String nameAccom, String addressAccom, String cityAccom, boolean isPool,
            boolean isDrink, boolean isBreak, boolean isGym, int maxCus, int price) {
        super(idAccom, nameAccom, addressAccom, cityAccom);
        this.isPool = isPool;
        this.isDrink = isDrink;
        this.isBreak = isBreak;
        this.isGym = isGym;
        this.maxCus = maxCus;
        this.price = price;
    }

    public LuxuryAccommodation(int idAccom, String nameAccom, String addressAccom, String cityAccom) {
        super(idAccom, nameAccom, addressAccom, cityAccom);
    }

    public boolean isPool() {
        return isPool;
    }

    public void setPool(boolean isPool) {
        this.isPool = isPool;
    }

    public boolean isDrink() {
        return isDrink;
    }

    public void setDrink(boolean isDrink) {
        this.isDrink = isDrink;
    }

    public boolean isBreak() {
        return isBreak;
    }

    public void setBreak(boolean isBreak) {
        this.isBreak = isBreak;
    }

    public boolean isGym() {
        return isGym;
    }

    public void setGym(boolean isGym) {
        this.isGym = isGym;
    }

    public int getMaxCus() {
        return maxCus;
    }

    public void setMaxCus(int maxCus) {
        this.maxCus = maxCus;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}