abstract class Accommodation {
    /* Code here */
    private int idAccom;
    private String nameAccom, addressAccom, cityAccom;
    
    public Accommodation(int idAccom, String nameAccom, String addressAccom, String cityAccom) {
        this.idAccom = idAccom;
        this.nameAccom = nameAccom;
        this.addressAccom = addressAccom;
        this.cityAccom = cityAccom;
    }

    public int getIdAccom() {
        return idAccom;
    }

    public void setIdAccom(int idAccom) {
        this.idAccom = idAccom;
    }

    public String getNameAccom() {
        return nameAccom;
    }

    public void setNameAccom(String nameAccom) {
        this.nameAccom = nameAccom;
    }

    public String getAddressAccom() {
        return addressAccom;
    }

    public void setAddressAccom(String addressAccom) {
        this.addressAccom = addressAccom;
    }

    public String getCityAccom() {
        return cityAccom;
    }

    public void setCityAccom(String cityAccom) {
        this.cityAccom = cityAccom;
    }

    @Override
    public String toString() {
        return "Accommodation [idAccom=" + idAccom + ", nameAccom=" + nameAccom + ", addressAccom=" + addressAccom
                + ", cityAccom=" + cityAccom + "]";
    }
}
