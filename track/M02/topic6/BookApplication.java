
import java.util.Scanner;

public class BookApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book b = new Book(scanner.nextLine(), scanner.nextLine());
        b.display();
    }
}
