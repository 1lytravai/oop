public abstract class Student3 {
    protected String sName;
    protected double gpa;

    public Student3(String sName, double gpa) {
        this.sName = sName;
        this.gpa = gpa;
    }

    public abstract String getRank();
}
