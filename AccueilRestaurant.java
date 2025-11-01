import java.util.Scanner;

public class AccueilRestaurant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==================================");
            System.out.println("Welcome to Pleasure Restaurant");
            System.out.println("==================================");
            System.out.println("1. Show food menu");
            System.out.println("2. Edit current order");
            System.out.println("3. Delete order");
            System.out.println("4. Show shopping cart");
            System.out.println("5. Confirm order and print receipt");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    MenuRestaurant.showMenu();
                    break;
                case 2:
                    MenuRestaurant.editOrder();
                    break;
                case 3:
                    MenuRestaurant.deleteOrder();
                    break;
                case 4:
                    ShoppingCart.showCart();  // ← هنا الربط مع المرحلة الرابعة
                    break;
                case 5:
                    MenuRestaurant.confirmOrder();
                    break;
                case 6:
                    System.out.println("Thank you for visiting Pleasure Restaurant!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 6);
    }
}
