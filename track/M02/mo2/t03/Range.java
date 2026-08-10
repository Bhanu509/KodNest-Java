
import java.util.Scanner;

public class Range {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting value: ");
        int a = scan.nextInt();
        System.out.println(a);
        System.out.println("Enter ending value: ");
        int b = scan.nextInt();
        System.out.println(b);
        int evenSum = 0;
        int oddCount = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                evenSum = i + evenSum;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd count: " + oddCount);
    }
}
