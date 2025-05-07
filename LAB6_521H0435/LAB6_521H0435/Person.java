public class Person {
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

    public Person(Person person) {
        this.name = person.name;
        this.address = person.address;
    }

    @Override 
    public String toString() {
        return "Name: " + this.name + "\n Address: " + this.address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}