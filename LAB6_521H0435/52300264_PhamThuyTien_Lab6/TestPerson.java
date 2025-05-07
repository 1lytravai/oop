import java.util.Scanner;
public class TestPerson{
    public static void main(String[] args) {
    Person guest1 = new Person();
    Person guest2 = new Person("HarryPotter", "Hogwarts");

    System.out.println(guest1.toString());
    System.out.println(guest2.toString());

    guest1.setName("Lord Voldemort");
    guest1.setAddress("secret");
    
    System.out.println("GetName: " + guest1.getName());
    System.out.println("GetAddress: " + guest1.getAddress());

    }

}
