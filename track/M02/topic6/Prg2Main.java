
import java.util.Scanner;

public class Prg2Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Prg2 s1 = new Prg2(name);
        s1.display();
    }
}
