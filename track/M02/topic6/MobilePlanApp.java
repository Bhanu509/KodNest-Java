
import java.util.Scanner;

public class MobilePlanApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String planName = scanner.nextLine();
        int price = scanner.nextInt();
        MobilePlan p = new MobilePlan();
        MobilePlan p1 = new MobilePlan(planName, price);
        p.display();
        p1.display();
    }
}
