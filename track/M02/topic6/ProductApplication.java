
import java.util.Scanner;

public class ProductApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product p = new Product(scanner.nextLine(), scanner.nextDouble());
        p.display();
    }
}
