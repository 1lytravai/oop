public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Snape", "Hogwarts", "Potion");
        Teacher t2 = new Teacher();

        System.out.println("t1: " + t1.toString());
        
        t2.setName("Draco");
        t2.setAddress("Hogwarts");
        t2.setSubject("isJustaStudent");

        System.out.println("t2: " + t2.toString());

    }
}