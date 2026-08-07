
import java.util.Scanner;

public class Char {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter char: ");
        char ch = scan.next().charAt(2);
        System.out.println(ch);
    }
}
