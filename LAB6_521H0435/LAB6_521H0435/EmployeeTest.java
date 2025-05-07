public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("AN001", "Julia", 1.2);
        Employee employee3 = new Employee("FD002", "Lee Kim", 2015, 1.5, 2);


        System.out.println("Employee 1: " + employee1);
        System.out.println("Employee 2: " + employee2);
        System.out.println("Employee 3: " + employee3);

 
        System.out.println("Seniority Salary of Employee 1: $" + employee1.getSenioritySalary());
        System.out.println("Emulation Grade of Employee 1: " + employee1.considerEmulation());
        System.out.println("Seniority Salary of Employee 2: $" + employee2.getSenioritySalary());
        System.out.println("Emulation Grade of Employee 2: " + employee2.considerEmulation());
        System.out.println("Salary of Employee 3: $" + employee3.getSalary());
        System.out.println("Seniority Salary of Employee 3: $" + employee3.getSenioritySalary());
    }
}
