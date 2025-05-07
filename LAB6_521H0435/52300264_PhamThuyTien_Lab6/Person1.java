public class Person1 {
    protected String name;
    protected String address;

    public Person() {
        this.name = "";
        this.address = "";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(Person P) {
        this.name = P.name;
        this.address = P.address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override 
    public String toString() {
        return "Name: " + this.name + "\nAddress: " + this.address; 
    }
}