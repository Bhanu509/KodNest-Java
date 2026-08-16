
import java.util.Scanner;

public class FoodOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();
        Food f = new Food(item);
        Food f1 = new Food(item, quantity);
        f.display();
        f1.display();
    }
}
