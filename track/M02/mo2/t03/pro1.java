
import java.util.Scanner;

public class pro1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter number of Practice days:");
        int a = scan.nextInt();
        System.out.println(a);
        System.out.println("enter number of problems solved in a day: ");
        int b = scan.nextInt();
        System.out.println(b);
        int total = a * b;
        System.out.println("Total solved: " + total);
        if (total >= 20) {
            System.out.println("Status: Strong progress");
        } else {
            System.out.println("keep improving");
        }
    }
}
