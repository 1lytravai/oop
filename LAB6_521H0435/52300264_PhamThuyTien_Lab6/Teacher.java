public class Teacher extends Person{
    protected String subject;

    public Teacher() {
        super();
        this.subject = "";
    }

    public Teacher(Teacher T) {
        super(T);
        this.subject = T.subject;
    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override 
    public String toString() {
        return this.name + " " + this.address + " " + this.subject;
    }
}