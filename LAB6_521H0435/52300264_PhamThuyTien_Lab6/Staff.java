public class Staff extends Person1 {
    protected String school;
    protected double pay;

    public Staff() {
        super();
        this.school = "";
        this.pay = 0.0000000000000000000;
    }

    public Staff(String name, String address, String school, double pay) {
        this.name = name;
        this.address = address; 
        this.school = school;
        this.pay = pay;
    }

    public Staff(Staff S) {
        super(S);
        this.school = S.school;
        this.pay = S.pay;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return this.pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override 
    public String toString() {
        return "Name: " + this.name + "\nAddress: " + this.address + "\nSchool: " + this.school + "\nPay: " + this.pay;
    }
}