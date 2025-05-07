import java.util.Scanner;

class VegetableFactory {

  public Vegetable getVegetable(String type) {
    if (type.equalsIgnoreCase("carrot")) {
      return new Carrot("C");
    } else if (type.equalsIgnoreCase("cabbage")) {
      return new Cabbage("cabbage", 1.4);
    } else if (type.equalsIgnoreCase("pumpkin")) {
      return new Pumpkin(2.9);
    } else {
      return null;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter vegetable:");
    String type = scanner.nextLine();

    VegetableFactory factory = new VegetableFactory();
    Vegetable vegetable = factory.getVegetable(type);

    if (vegetable != null) {
      System.out.println("Vegetable: " + vegetable.getInfo());
    } else {
      System.out.println("Undentifier");
    }

    scanner.close();
  }
}