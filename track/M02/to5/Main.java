
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int first = scan.nextInt();
        int second = scan.nextInt();
        MethodDemo m = new MethodDemo();
        m.sayHello();
        m.greet(name);
        int luckynumber = m.getLuckyNumber();
        System.out.println("Lucky Number: " + luckynumber);
        int sum = m.add(first, second);
        System.out.println("Sum: " + sum);
    }
}
