
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter monthly income: ");
        double a = scan.nextDouble();
        System.out.println(a);
        System.out.println("Enter  rent expenses: ");
        double b = scan.nextDouble();
        System.out.println(b);
        System.out.println("Enter food expenses: ");
        double c = scan.nextDouble();
        System.out.println(c);
        System.out.println("Enter travel expenses: ");
        double d = scan.nextDouble();
        System.out.println(d);
        double total = b + c + d;
        System.out.println("Total Expense: " + total);
        double remainingamount = a - total;
        System.out.println("Remaining Amount: " + remainingamount);
        if (remainingamount >= 0) {
            System.out.println("With in Budget");
        } else {
            System.out.println("Over Budget");
        }
    }
}
