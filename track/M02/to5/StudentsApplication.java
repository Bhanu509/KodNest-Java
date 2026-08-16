
import java.util.Scanner;

public class StudentsApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Students s = new Students();
        s.setName(name);
        s.displayName();
    }
}
