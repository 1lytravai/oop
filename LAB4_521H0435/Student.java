public class Student {
    private int id;
    private String firstName, lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to get full name
    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    public static void main(String[] args) {
        // Example usage
        Student student1 = new Student(441, "An", "Vu");
        System.out.println("Student 1: " + student1);
        System.out.println("Full Name: " + student1.getName());
    }


}
