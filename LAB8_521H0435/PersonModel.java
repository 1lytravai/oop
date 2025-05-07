import java.util.ArrayList;

class PersonModel {
    private ArrayList<Person> people;

    public PersonModel() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public void display() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        PersonModel model = new PersonModel();

        Person person1 = new Person("An", 1990);
        Person person2 = new Person("Tu", 1980);

        model.add(person1);
        model.add(person2);

        Student student1 = new Student("An", 1990, "AN001", 90.5);
        Student student2 = new Student("Vu", 1990, "VU002", 99.2);

        model.add(student1);
        model.add(student2);

        Employee employee1 = new Employee("Tran", 1975, "EMP007", 80000);
        Employee employee2 = new Employee("Phong", 1978, "EMP007", 80000);

        model.add(employee1);
        model.add(employee2);

        model.display();
    }

}
