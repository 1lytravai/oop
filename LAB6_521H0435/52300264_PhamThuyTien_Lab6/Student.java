public class Student extends Person1 {
    protected String program;
    protected int year;
    protected double fee;

    public Student() {
        super();
        this.program = "";
        this.year = 0f;
        this.fee = 0.0000000000000000000000;
    }

    public Student(String name, String address, String program, int year, double fee) {
        this.name = name;
        this.address = address;
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public Student(Student St) {
        super(St);
        this.program = St.program;
        this.year = St.year;
        this.fee = St.fee;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return this.fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override 
    public String toString() {
        return "Name: " + this.name + "\nAddress: " + this.address + "\nProgram: " + this.program + "\nYear: " + this.year + "\nFee: " + this.fee;
    }
}