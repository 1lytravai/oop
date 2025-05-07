public class Employee {
    private String ID;
    private String fullName;
    private int yearJoined;
    private double coefficientsSalary;
    private double basicSalary;
    private int numDaysOff;

    public Employee() {
        this.ID = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.basicSalary = 1150;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = 2020;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }

    public double getSenioritySalary() {
        int yearsOfWork = Math.max(0, 2024 - yearJoined);
        double basicSalary = 1150;
        if (yearsOfWork >= 5) {
            return (yearsOfWork * basicSalary) / 100;
        }
        return 0;
    }

    public String considerEmulation() {
        if (numDaysOff <= 1) {
            return "A";
        } else if (numDaysOff <= 3) {
            return "B";
        } else {
            return "C";
        }
    }

    public double getSalary() {
        double basicSalary = 1150;
        double senioritySalary = getSenioritySalary();
        String emulationGrade = considerEmulation();
        double emulationCoefficient = 1.0;

        if (emulationGrade.equals("B")) {
            emulationCoefficient = 0.75;
        } else if (emulationGrade.equals("C")) {
            emulationCoefficient = 0.5;
        }

        return basicSalary + basicSalary * (coefficientsSalary + emulationCoefficient) + senioritySalary;
    }

    // Getters and Setters
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public double getBasicSalary(){
        return basicSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public int getNumDaysOff() {
        return numDaysOff;
    }

    public void setNumDaysOff(int numDaysOff) {
        this.numDaysOff = numDaysOff;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // toString 
    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + ID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", yearJoined=" + yearJoined +
                ", coefficientsSalary=" + coefficientsSalary +
                ", basicSalary=" + basicSalary +
                ", numDaysOff=" + numDaysOff +
                '}';
    }
}
