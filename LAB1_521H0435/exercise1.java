import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your date of birth: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Enter your student ID: ");
        String studentId = scanner.nextLine();

        Student student = new Student(name, dateOfBirth, studentId);

        System.out.println("\nStudent Information:");
        student.displayStudent();

        scanner.close();
    }
}

class Student {
    private String name;
    private String dateOfBirth;
    private String studentId;

    public Student(String name, String dateOfBirth, String studentId) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.studentId = studentId;
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Student ID: " + studentId);
    }
}

