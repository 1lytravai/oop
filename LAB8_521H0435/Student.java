class Student extends Person {
    private String studentID;
    private double score;

    public Student(String name, int birthYear, String studentID, double score) {
        super(name, birthYear);
        this.studentID = studentID;
        this.score = score;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentID + ", Score: " + score;
    }


}
