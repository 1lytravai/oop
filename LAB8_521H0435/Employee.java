class Employee extends Person {
    private String employeeID;
    private double salary;

    public Employee(String name, int birthYear, String employeeID, double salary) {
        super(name, birthYear);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {  
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Employee ID: " + employeeID + ", Salary: " + salary;
    }
}
