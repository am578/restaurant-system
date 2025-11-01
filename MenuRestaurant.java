import java.util.Scanner;

public class MenuRestaurant {
    static Scanner input = new Scanner(System.in);
    static String[] meals = {"Pizza", "Burger", "Shawarma", "Tacos"};
    static double[] prices = {700, 650, 500, 600};
    static String selectedMeal = "";
    static int quantity = 0;
    static double total = 0;

    // Show menu
    public static void showMenu() {
        System.out.println("\n📋 Food Menu:");
        for (int i = 0; i < meals.length; i++) {
            System.out.println((i + 1) + ". " + meals[i] + " — " + prices[i] + " DZD");
        }

        System.out.print("➡️ Choose meal number: ");
        int choice = input.nextInt();

        if (choice >= 1 && choice <= meals.length) {
            selectedMeal = meals[choice - 1];
            System.out.print("Enter quantity: ");
            quantity = input.nextInt();
            total = prices[choice - 1] * quantity;
            System.out.println("✅ Added " + quantity + " " + selectedMeal + "(s) to your order.");
        } else {
            System.out.println("❌ Invalid choice!");
        }
    }

    // Edit order
    public static void editOrder() {
        if (selectedMeal.isEmpty()) {
            System.out.println("⚠️ No order to edit!");
            return;
        }

        System.out.println("\n📝 Editing current order: " + selectedMeal + " × " + quantity);
        System.out.print("Enter new quantity: ");
        quantity = input.nextInt();

        for (int i = 0; i < meals.length; i++) {
            if (meals[i].equals(selectedMeal)) {
                total = prices[i] * quantity;
                System.out.println("✅ Quantity updated to " + quantity);
            }
        }
    }

    // Delete order
    public static void deleteOrder() {
        if (selectedMeal.isEmpty()) {
            System.out.println("⚠️ No order to delete!");
            return;
        }
        selectedMeal = "";
        quantity = 0;
        total = 0;
        System.out.println("🗑️ Order deleted successfully!");
    }

    // Confirm order
    public static void confirmOrder() {
        if (selectedMeal.isEmpty()) {
            System.out.println("⚠️ No order to confirm!");
            return;
        }

        System.out.println("\n✅ Order confirmed:");
        System.out.println("Meal: " + selectedMeal);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total + " DZD");
        System.out.println("==============================");
        System.out.println("Thank you for your order ❤️");
    }
}
