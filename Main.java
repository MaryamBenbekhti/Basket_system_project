import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1- Add item to basket: ");
            System.out.println("2- Remove item from basket: ");
            System.out.println("3- Show basket: ");
            System.out.println("4- Exit: ");
            System.out.println("Choose an option: ");

            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter the item name: ");
                String name = input.next();

                System.out.println("Enter the item price: ");
                double price = input.nextDouble();

                basket.add(new Item(name , price));
            } else if (choice == 2) {
                System.out.println("Enter the item name: ");
                String name = input.next();

                basket.remove(name);
            } else if (choice == 3) {
                basket.showBasket();
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else{
                System.out.println("Wrong choice, Try again!");
            }
        }
    }
}