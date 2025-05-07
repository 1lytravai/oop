public class ManagerTest {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        Manager manager2 = new Manager("L002", "Alice", 0.9, "Head of Operations", 5);
        Manager manager3 = new Manager("K0012", "Kim", 2019, 1.5, 2, "Head of Finance", 5);
        
        System.out.println("Manager 1: " + manager1);
        System.out.println("Manager 2: " + manager2);
        System.out.println("Manager 3: " + manager3);


        System.out.println("Emulation Grade of Manager 1: " + manager1.considerEmulation());
        System.out.println("Emulation Grade of Manager 2: " + manager2.considerEmulation());
        System.out.println("Bonus by Position of Manager 2: $" + manager2.bonusByPosition());
        System.out.println("Salary of Manager 2: $" + manager2.getSalary());
        System.out.println("Salary of Manager 3: $" + manager3.getSalary());

    }
}
 