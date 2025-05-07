import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();

        while (true) {
            vendingMachine.displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    vendingMachine.selectItem("Coca", 2.0);
                    break;
                case 2:
                    vendingMachine.selectItem("Pepsi", 4.0);
                    break;
                case 3:
                    vendingMachine.selectItem("Spite", 4.0);
                    break;
                case 4:
                    vendingMachine.selectItem("Snack", 5.0);
                    break;
                case 5:
                    vendingMachine.shutdownMachine();
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

class VendingMachine {
    private double balance;

    // Constructor to initialize the balance
    public VendingMachine() {
        this.balance = 0.0;
    }

    // Method to display the menu
    public void displayMenu() {
        System.out.println("Menu");
        System.out.println("1. Coca - $2.00");
        System.out.println("2. Pepsi - $4.00");
        System.out.println("3. Spite - $4.00");
        System.out.println("4. Snack - $5.00");
        System.out.println("5. Shutdown Machine");
        System.out.println("Please enter the number:");
    }

    // Method to select an item from the vending machine
    public void selectItem(String item, double price) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The price of" + item + "is $" + price + "please enter the amount of money:");
        double payment = scanner.nextDouble();

        if (payment >= price) {
            double change = payment - price;
            balance += price;
            System.out.println("Dispensing " + item);
            if (change > 0) {
                System.out.println("Your Change is: $" + change);
            }
        } else {
            System.out.println("Not enough money to buy this item. Please insert again");
        }
    }

    // Method to shutdown the vending machine
    public void shutdownMachine() {
        System.out.println("Machine is shutdown");
    }
}
