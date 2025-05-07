class MathStudent extends Student3 {
    private String sID;

    public MathStudent(String sName, double gpa, String sID) {
        super(sName, gpa);
        this.sID = sID;
    }

    @Override
    public String getRank() {
        if (gpa >= 5) {
            return "Passed";
        } else {
            return "Failed";
        }
    }
}
