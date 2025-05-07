public class Manager extends Employee {
    private String position;
    private String department;
    private double salaryCoefficientPosition;


    public Manager() {
        super();
        this.position = "Head of the Administrative Office";
        this.salaryCoefficientPosition = 5.0;
    }

   
    public Manager(String ID, String fullName, double coefficientsSalary, String position,
            double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

 
    public Manager(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff,
            String position, double salaryCoefficientPosition) {
        super(ID, fullName, yearJoined, coefficientsSalary, numDaysOff);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    @Override
    public String considerEmulation() {
        return "A";
    }


    public double bonusByPosition() {
        double basicSalary = 1150;
        return basicSalary * salaryCoefficientPosition;
    }

  
    @Override
    public double getSalary() {
        double basicSalary = 1150;
        double senioritySalary = getSenioritySalary();
        double emulationCoefficient = 1.0;
        double positionBonus = bonusByPosition();

        return basicSalary + basicSalary * (getCoefficientsSalary() + emulationCoefficient) + senioritySalary
                + positionBonus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalaryCoefficientPosition() {
        return salaryCoefficientPosition;
    }

    public void setSalaryCoefficientPosition(double salaryCoefficientPosition) {
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    // toString 
    @Override
    public String toString() {
        return "Manager{" +
                "ID='" + getID() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", yearJoined=" + getYearJoined() +
                ", coefficientsSalary=" + getCoefficientsSalary() +
                ", numDaysOff=" + getNumDaysOff() +
                ", position='" + position + '\'' +
                ", salaryCoefficientPosition=" + salaryCoefficientPosition +
                '}';
    }
}
